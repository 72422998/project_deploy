package com.prueba.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class IndexController {
    @GetMapping("/mensaje")
    public String mensaje(){
        return "Bienvenido desde JAVA a AZURE";
    }
}
