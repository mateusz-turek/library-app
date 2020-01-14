package project3.libraryapp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    private LocalDate EditionDate;

    public BookModel() {
    }

    public BookModel(Long id, String author, String title, LocalDate editionDate) {
        this.id = id;
        this.author = author;
        this.title = title;
        EditionDate = editionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEditionDate() {
        return EditionDate;
    }

    public void setEditionDate(LocalDate editionDate) {
        EditionDate = editionDate;
    }
}
