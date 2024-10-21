package com.inteye.tools.api.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 状态标记校验器
 * Created by inteye on 2/14/19.
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Integer> {

    private String[] values;

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if (value == null) {
            //状态为空时使用默认值
            return true;
        }
        for(int i = 0; i < values.length; i++) {
            if (values[i].equals(String.valueOf(value))) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    @Override
    public void initialize(FlagValidator flagValidator) {
        this.values = flagValidator.value();
    }
}
