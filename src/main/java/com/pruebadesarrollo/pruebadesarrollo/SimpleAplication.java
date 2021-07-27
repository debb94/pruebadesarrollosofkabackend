package com.pruebadesarrollo.pruebadesarrollo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "*")
public class SimpleAplication {

    @GetMapping(path = "/saludar")
    public List<Persona> saludar(@RequestParam(name="name", required = false) String name,@RequestParam(name="language", required = false) String language){
        ArrayList<Persona> listPersona = new ArrayList<>();

        Persona persona = new Persona(name);

        if(language == null){
            language = "spanish";
        }

        switch(language.toLowerCase()){
            case "english":
                persona.setSaludo("Hi "+name+", Welcome to our application");
            break;
            case "spanish":
                persona.setSaludo("Hola "+name+", Bienvenido a nuestra aplicación");
            break;
            default:
                persona.setSaludo("Hola "+name+", Bienvenido a nuestra aplicación");
            break;
        }
        listPersona.add(persona);
        return listPersona;
    }

    @GetMapping("/despedir")
    public List<Persona> despedir(@RequestParam(name="name", required = false) String name,@RequestParam(name="language", required = false) String language){
        ArrayList<Persona> listPersona = new ArrayList<>();

        Persona persona = new Persona(name);

        if(language == null){
            language = "spanish";
        }

        switch(language.toLowerCase()){
            case "english":
                persona.setDespedida("See you later "+name);
                break;
            case "spanish":
                persona.setDespedida("Hasta luego "+name);
                break;
            default:
                persona.setDespedida("Hasta luego "+name);
                break;
        }
        listPersona.add(persona);
        return listPersona;
    }

    @GetMapping("/")
    public List<Persona> name(@RequestParam(name="name", required = false) String name,@RequestParam(name="language", required = false) String language){
        ArrayList<Persona> listPersona = new ArrayList<>();

        Persona persona = new Persona(name);

        if(language == null){
            language = "spanish";
        }

        switch(language.toLowerCase()){
            case "english":
                persona.setMiNombre("My name is: "+name);
                break;
            case "spanish":
                persona.setMiNombre("Mi nombre es: "+name);
                break;
            default:
                persona.setMiNombre("Mi nombre es: "+name);
                break;
        }
        listPersona.add(persona);
        return listPersona;
    }



}
