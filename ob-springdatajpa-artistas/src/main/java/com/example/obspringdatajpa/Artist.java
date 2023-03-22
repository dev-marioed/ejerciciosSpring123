package com.example.obspringdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
//Para que peuda almacenarse en la base de datos, debe de ser una entidad.
//otras clases no se almacenan en la BD

public class Artist {



        // atributos encapsulados
        //anotar la clave primaria. viene de JPA ¿Qué es JPA?
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String genre;
        private Integer albumsPublished;

        // constructores

        public Artist() {
        }

    public Artist(Long id, String name, String genre, Integer albumsPublished) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.albumsPublished = albumsPublished;
    }



        // tostring

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", albumsPublished=" + albumsPublished +
                '}';
    }
}
