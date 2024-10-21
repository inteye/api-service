package com.inteye.tools.api.bo;

import com.inteye.tools.model.CmUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * SpringSecurity需要的用户详情
 * Created by inteye on 12/18/18.
 */
public class CmUserDetails implements UserDetails {

    private CmUser cmUser;

    public CmUserDetails(CmUser user) {
        this.cmUser = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return null;
    }

    public Long getUserId() {
        return this.cmUser.getId();
    }

    @Override
    public String getPassword() {
        return cmUser.getPassword();
    }

    @Override
    public String getUsername() {
        return cmUser.getPhone();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return cmUser.getStatus().equals((short)1);
    }
}
