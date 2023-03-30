package com.coffeeplains.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.GenerationType.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String sinopse;

    private String categoria;

    private String autor;

    private LocalDate dateDeLancamento;

    private int totalPaginas;
}
