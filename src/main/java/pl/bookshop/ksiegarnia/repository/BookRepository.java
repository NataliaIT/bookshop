package pl.bookshop.ksiegarnia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bookshop.ksiegarnia.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
