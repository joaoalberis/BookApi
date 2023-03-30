package com.coffeeplains.controller;

import com.coffeeplains.dto.BookDto;
import com.coffeeplains.dto.update.BookDtoUpdate;
import com.coffeeplains.entity.BookEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.coffeeplains.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public BookEntity createBook(@Valid @RequestBody BookDto book){
        return bookService.createBook(book);
    }

    @GetMapping
    public List<BookEntity> getAll(@RequestParam(name = "titulo", required = false) String titulo,
                                   @RequestParam(name = "categoria", required = false) String categoria){
        if (titulo != null){
            if (categoria != null){
                return bookService.getAllCategoriaName(titulo, categoria);
            }
            return bookService.getAllName(titulo);
        }else if(categoria != null){
            return bookService.getAllCategoria(categoria);
        }
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public BookEntity getId(@PathVariable(name = "id") Long id){
        return bookService.getId(id);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@Valid @RequestBody BookDtoUpdate update, @PathVariable(name = "id") Long id){
        if (bookService.existsBook(id) == true){
            return bookService.updateBook(update, id);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable(name = "id") Long id){
        if(bookService.existsBook(id) == true){
            bookService.deleteBook(id);
        }
    }
}
