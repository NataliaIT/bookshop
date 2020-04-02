package pl.bookshop.ksiegarnia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    private Long idBook;

    @NonNull
    private String title;

    @NonNull
    private String authorName;

    @NonNull
    private String authorLastName;
}
