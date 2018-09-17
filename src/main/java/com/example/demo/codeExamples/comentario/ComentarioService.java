package com.example.demo.codeExamples.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

@Service
public class ComentarioService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    ComentarioRepository comentarioRepository;

    public List<Comentario> obtenerComentarios(){
       return comentarioRepository.findAll();
    }

    public ArrayList<Comentario> obtenerComentarioJDBC(){
        try{
            String query = "select * from Comentario";
            ArrayList<Comentario> comentarios = (ArrayList) this.jdbcTemplate.query(query,
                    new RowMapper<Comentario>() {
                        public Comentario mapRow(ResultSet rs, int rowNum) throws SQLException {
                            Comentario comentario = new Comentario();
                            comentario.setId(Long.parseLong(rs.getString("id")));
                            comentario.setCalificacion(Integer.parseInt(rs.getString("calificacion")));
                            comentario.setContenido(rs.getString("contenido"));
                            return comentario;
                        }
                    });
            return comentarios;
        } catch (Exception e){
            System.out.println("Ocurrió un error" + e.getMessage());
            return null;
        }
    }





}
