package com.coffeeplains.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    @NotEmpty
    private String titulo;

    @NotEmpty
    private String sinopse;

    @NotEmpty
    private String categoria;

    @NotEmpty
    private String autor;

    @NotNull
    private LocalDate dateDeLancamento;

    @NotNull
    @Positive
    private int totalPaginas;
}
