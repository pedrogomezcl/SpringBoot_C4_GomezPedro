package com.example.C4;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @DeleteMapping("/hola")
    public String hola(){
        return "Hola";
    }
    @GetMapping("/hola")
    public String holaG(){
        return "Hola GIGIGIGIGIGI";
    }
    @GetMapping("/adios")
    public String adios(){
        return "Adios";
    }

    @GetMapping("/persona")
    public Persona obtenerPersona(){
        return new Persona("Jose", 23);
    }
}
