package com.example.demo.codeExamples.publicaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {

    @Autowired
    PublicacionRepository publicacionRepository;

    public List<Publicacion> obtenerPublicaciones(){
        return publicacionRepository.findAll();
    }

    public Publicacion insertarPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }
}
