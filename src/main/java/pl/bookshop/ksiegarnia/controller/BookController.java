package pl.bookshop.ksiegarnia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.bookshop.ksiegarnia.entity.Book;
import pl.bookshop.ksiegarnia.repository.BookRepository;

import java.util.List;

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


    @GetMapping("/book/list")
    public ResponseEntity<List<Book>> showAllBooks(){
        List<Book> books = bookRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(books);
    }
}
