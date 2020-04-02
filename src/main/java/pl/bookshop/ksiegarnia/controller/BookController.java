package pl.bookshop.ksiegarnia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.bookshop.ksiegarnia.entity.Book;
import pl.bookshop.ksiegarnia.repository.BookRepository;

@RestController
public class BookController {

    private final BookRepository bookRepository;


    @Autowired
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/{id}")
    public Book showBook(@PathVariable Long id){
        return bookRepository.findById(id).get();
    }

}
