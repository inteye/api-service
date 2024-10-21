package com.inteye.tools.api.handler;

import com.inteye.tools.api.service.CmUserAttemptsService;
import com.inteye.tools.model.CmUserAttempts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * 自定义auth类
 * Created by inteye on 2/14/19.
 */
@Component
public class CustomAuthenticationProvider extends DaoAuthenticationProvider {

    @Resource
    private CmUserAttemptsService cmUserAttemptsService;

    @Autowired
    @Qualifier("userDetailsService")
    @Override
    public void setUserDetailsService(UserDetailsService userDetailsService) {
        super.setUserDetailsService(userDetailsService);
    }

    @Override
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        super.setPasswordEncoder(passwordEncoder);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        try {
            Authentication auth = super.authenticate(authentication);
            cmUserAttemptsService.resetFailAttempts(authentication.getName());
            return auth;
        } catch (BadCredentialsException e) {
            cmUserAttemptsService.updateFailAttempts(authentication.getName());
            throw e;
        } catch (LockedException e) {
            String error;
            CmUserAttempts cmUserAttempts = cmUserAttemptsService.getUserAttempts(authentication.getName());
            if (cmUserAttempts != null) {
                error = "用户错误次数超限，已被锁定";
            } else {
                error = e.getMessage();
            }
            throw new LockedException(error);
        }
    }

}
