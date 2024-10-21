package com.inteye.tools.api.component;

import com.inteye.tools.api.dto.CommonResult;
import com.inteye.tools.api.util.JsonUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当访问接口没有权限时,自定义返回结果
 * Created by inteye on 12/18/18.
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler{

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JsonUtil.objectToJson(new CommonResult().forbidden(e.getMessage())));
        response.getWriter().flush();
    }
}
