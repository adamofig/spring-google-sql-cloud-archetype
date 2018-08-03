package com.example.demo.codeExamples.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {
    @Autowired
    ComentarioRepository comentarioRepository;

    public List<Comentario> obtenerComentarios(){
       return comentarioRepository.findAll();
    }

}
