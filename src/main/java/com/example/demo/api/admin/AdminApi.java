package com.example.demo.api.admin;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminApi {

    @GetMapping("admin")
    @PreAuthorize("hasRole('admin')")
    public String admin(){
        return "admin";
    }

    @GetMapping("info")
    public String info(){
        return "admin-info";
    }
}
