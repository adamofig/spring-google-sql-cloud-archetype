package com.example.demo.codeExamples.publicaciones;

import com.example.demo.codeExamples.comentario.Comentario;
import com.example.demo.codeExamples.usuario.Usuario;

import javax.persistence.*;
import java.util.List;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String titulo;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private String contenido;

    @ManyToOne( cascade =  CascadeType.PERSIST )
    @JoinColumn( name = "usuarioId")
    private Usuario usuario;


    public List<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }

    @OneToMany()
    @JoinColumn(name = "publicacionId")

    private List<Comentario> comentario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
