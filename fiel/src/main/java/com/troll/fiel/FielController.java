package com.troll.fiel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FielController {

    @GetMapping("/")
    public String inicio() {
        return "fiel";
    }
}