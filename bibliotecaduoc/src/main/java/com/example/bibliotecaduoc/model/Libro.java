package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Libro {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Libro {

        private int id;
        private String isbn;
        private String titulo;
        private String editorial;
        private int fechaPublicacion;
        private String autor;
    }
}
