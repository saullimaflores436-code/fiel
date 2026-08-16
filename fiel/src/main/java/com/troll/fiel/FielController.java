package com.troll.fiel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FielController {

    @GetMapping("/")
    public String inicio() {
        return "La aplicación está funcionando correctamente";
    }
}