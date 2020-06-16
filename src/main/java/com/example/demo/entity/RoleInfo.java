package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;

public class RoleInfo implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return "ROLE_admin";
    }
}
