package com.tsn.docker;

import com.tsn.docker.interceptor.InterceptLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ehsan Zarei
 * @since 1/15/2023
 */
@Component
public class CustomWebConfigurer implements WebMvcConfigurer {
    @Autowired
    private InterceptLog logInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor);
    }
}
