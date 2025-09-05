package br.com.aelxand.portfolioapi.controllers;

import br.com.aelxand.portfolioapi.config.GeneralConfig;
import br.com.aelxand.portfolioapi.controllers.interceptor.CustomRequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    private final Logger log = GeneralConfig.loadLogStatic();

    @GetMapping("/getTest")
    public void get(){
        log.info("GET");
    }
}
