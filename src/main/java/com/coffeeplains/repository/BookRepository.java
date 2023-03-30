package com.coffeeplains.repository;

import com.coffeeplains.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    List<BookEntity> findAllByTituloContains(String titulo);

    List<BookEntity> findAllByTituloContainsAndCategoriaContains(String titulo, String categoria);

    List<BookEntity> findAllByCategoriaContains(String categoria);
}
