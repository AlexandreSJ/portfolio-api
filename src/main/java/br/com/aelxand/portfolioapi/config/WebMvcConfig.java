package br.com.aelxand.portfolioapi.config;

import br.com.aelxand.portfolioapi.controllers.interceptor.CustomRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private CustomRequestInterceptor customRequestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customRequestInterceptor)
                .addPathPatterns("/**");
    }

}
