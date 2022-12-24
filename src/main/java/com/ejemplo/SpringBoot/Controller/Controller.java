package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    //RequesBody permite traer la persona
    //en el cuerpo de la solicitud en un json
    public void agregarPersona(@RequestBody Persona perso){
        //listaPersonas.add(perso);
        persoServ.crearPersona(perso);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    //Para ver el json de la lista de personas
    public List<Persona> verPersonas(){
        //return listaPersonas;
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
