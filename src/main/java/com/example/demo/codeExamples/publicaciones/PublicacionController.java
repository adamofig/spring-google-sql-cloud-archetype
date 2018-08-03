package com.example.demo.codeExamples.publicaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicacionController {
    @Autowired
    PublicacionService publicacionService;

    @GetMapping("/publicacion")
    public List<Publicacion> obtenerPublicaciones(){
        return publicacionService.obtenerPublicaciones();
    }

    @PostMapping("/publicacion")
    public Publicacion guardarPublicacion(@RequestBody Publicacion publicacion){
        return publicacionService.insertarPublicacion(publicacion);
    }

}
