package com.example;

import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.context.*;

public class SpringWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{
    public SpringWebApplicationInitializer() {
        super(WebSecurityConfig.class);
    }
}
