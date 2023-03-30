package com.coffeeplains.service;

import com.coffeeplains.dto.BookDto;
import com.coffeeplains.dto.update.BookDtoUpdate;
import com.coffeeplains.entity.BookEntity;
import com.coffeeplains.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookEntity createBook(BookDto book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAutor(book.getAutor());
        bookEntity.setTitulo(book.getTitulo());
        bookEntity.setCategoria(book.getCategoria());
        bookEntity.setSinopse(book.getSinopse());
        bookEntity.setDateDeLancamento(book.getDateDeLancamento());
        bookEntity.setTotalPaginas(book.getTotalPaginas());
        return bookRepository.save(bookEntity);
    }

    public List<BookEntity> getAll() {
        return bookRepository.findAll();
    }

    public BookEntity getId(Long id){
        return bookRepository.findById(id).get();
    }

    public List<BookEntity> getAllName(String titulo) {
        return bookRepository.findAllByTituloContains(titulo);
    }

    public boolean existsBook(Long id){
        return bookRepository.existsById(id);
    }

    public BookEntity updateBook(BookDtoUpdate update, Long id) {
        BookEntity bookEntity = bookRepository.findById(id).get();
        bookEntity.setDateDeLancamento(update.getDateDeLancamento());
        bookEntity.setAutor(update.getAutor());
        bookEntity.setTitulo(update.getTitulo());
        bookEntity.setCategoria(update.getCategoria());
        bookEntity.setSinopse(update.getSinopse());
        bookEntity.setTotalPaginas(update.getTotalPaginas());
        return bookRepository.save(bookEntity);
    }

    public List<BookEntity> getAllCategoriaName(String titulo, String categoria) {
        return bookRepository.findAllByTituloContainsAndCategoriaContains(titulo, categoria);
    }

    public List<BookEntity> getAllCategoria(String categoria) {
        return bookRepository.findAllByCategoriaContains(categoria);
    }
}
