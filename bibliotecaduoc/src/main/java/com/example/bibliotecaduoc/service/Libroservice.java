package com.example.bibliotecaduoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Libroservice {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getlibros() {
        return libroRepository.obtenerLibros();
    }
}
