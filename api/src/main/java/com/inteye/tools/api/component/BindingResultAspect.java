package com.inteye.tools.api.component;

import com.inteye.tools.api.dto.CommonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * HibernateValidator错误结果处理切面
 * Created by inteye on 2/15/19.
 */
@Aspect
@Component
@Order(2)
public class BindingResultAspect {

    @Pointcut("execution(public * com.inteye.tools.api.controller.*.*(..))")
    public void BindingResult() {
    }

    @Around("BindingResult()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result.hasErrors()) {
                    return new CommonResult().validateFailed(result);
                }
            }
        }
        return joinPoint.proceed();
    }

}
