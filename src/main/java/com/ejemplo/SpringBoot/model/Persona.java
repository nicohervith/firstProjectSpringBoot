package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
//Anotattion de JPA
@Entity
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    
    public Persona(){
    }
    public Persona(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
