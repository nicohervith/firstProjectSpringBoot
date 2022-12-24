package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/* Se encarga de recibir las peticiones y dar las respuestas */
@RestController
public class Controller {
    //Obtener información
    //@Get
    
    //Enviar información
    //@Post

    List<Persona> listaPersonas = new ArrayList();
    
    @GetMapping("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
            @PathVariable String apellido,
            @PathVariable int edad){
        return "Hola Mundo " + nombre + " apellido "
                + apellido + " edad: " + edad;
    }
    
    @GetMapping("/chau")
    //RequestParam me permite recibir el nombre
    //Sin agregar las rutas
    public String decirChau(@RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam int edad){
        return "Chau mundo " + nombre + " apellido: " + 
                apellido + " edad: " + edad;
    }
    
    @PostMapping("/new/persona")
    //RequesBody permite traer la persona
    //en el cuerpo de la solicitud en un json
    public void agregarPersona(@RequestBody Persona perso){
        listaPersonas.add(perso);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    //Para ver el json de la lista de personas
    public List<Persona> verPersonas(){
        return listaPersonas;
    }
}
