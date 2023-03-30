package com.coffeeplains.dto.update;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDtoUpdate {

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
