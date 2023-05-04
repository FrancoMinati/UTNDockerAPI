package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UTNController {

    @GetMapping("/saludar")
    public String saludo(){
        return "Hola Gordito";
    }
}
