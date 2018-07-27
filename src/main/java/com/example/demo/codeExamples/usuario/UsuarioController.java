package com.example.demo.codeExamples.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(path = "/usuarios")
    private ArrayList<Usuario> getUsuarios() {
        System.out.println("Buscando usuarios");
        return usuarioService.obtenerTodosUsuarios();
    }

    @GetMapping(path = "/")
    private String mainRoot() {
        return "Hello World Spring Boot - Google Cloud Platfom - Sql Cloud";
    }
}
