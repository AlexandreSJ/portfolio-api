package br.com.aelxand.portfolioapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class API {

    @GetMapping("/getTest")
    public void get(){
        System.out.println("GET TEST");
    }
}
