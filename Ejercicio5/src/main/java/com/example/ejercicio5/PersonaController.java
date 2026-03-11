package com.example.ejercicio5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
