package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Implemento una clase que me permite trabajar con los 
//elementos del repositorio, por ejemplo encontrar, eliminar, etc
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
