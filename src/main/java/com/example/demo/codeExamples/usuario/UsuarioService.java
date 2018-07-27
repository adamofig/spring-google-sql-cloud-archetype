package com.example.demo.codeExamples.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerTodosUsuarios() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

}
