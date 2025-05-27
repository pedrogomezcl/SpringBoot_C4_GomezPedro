package Clase2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    static ArrayList<Persona> personas = new ArrayList<>();
    static int contador=1;
    static {
        personas.add(new Persona(contador++,"Pedro","Gomez",25));
        personas.add(new Persona(contador++,"Pedro","Gomez",22));
    }

    //Obtener Personas
    @GetMapping
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    //Obtener Personas por ID
    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable int id) {
        for(Persona persona : personas) {
            if(persona.getId()==id) {
                return persona;
            }
        }
        return null;
    }

    //Crear una persona
    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        persona.setId(contador++);
        personas.add(persona);
        return persona;
    }

}
