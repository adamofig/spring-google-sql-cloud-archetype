package com.example.demo.codeExamples.usuario;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
