package project3.libraryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import project3.libraryapp.model.BookModel;
import project3.libraryapp.repository.BookRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class BookModelService {
    private BookRepository bookRepository;

    @Autowired
    public BookModelService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Optional<BookModel> findById(Long id){
        return bookRepository.findById(id);
    }

    public Iterable<BookModel> findAll(){
        return bookRepository.findAll();
    }

    public BookModel addRecord (BookModel bookModel){
        return bookRepository.save(bookModel);
    }

    public void deleteModel (BookModel bookModel){
        bookRepository.delete(bookModel);
    }
    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sampleRecord(){
        addRecord(new BookModel(1L, "Sample Author", "Sample Title", LocalDate
                .of(2000, 2, 20)));
    }
}
