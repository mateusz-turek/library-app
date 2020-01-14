package project3.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project3.libraryapp.model.BookModel;
import project3.libraryapp.service.BookModelService;

import java.util.Optional;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private BookModelService bookModelService;

    @Autowired
    public LibraryController(BookModelService bookModelService) {
        this.bookModelService = bookModelService;
    }

    @GetMapping("/list")
    public Iterable<BookModel> getBookModelList() {
        return bookModelService.findAll();
    }

    @GetMapping("/one")
    public Optional<BookModel> getOneRecord(@RequestParam Long index) {
        return bookModelService.findById(index);
    }

    @PostMapping("/add")
    public BookModel addRecord(@RequestBody BookModel bookModel) {
        return bookModelService.addRecord(bookModel);
    }

    @PutMapping("/change")
    public BookModel changeRecord( @RequestBody BookModel bookModel) {
       return bookModelService.addRecord(bookModel);
    }

    @DeleteMapping("/delete")
    public void removeRecord(@RequestParam Long index) {
        bookModelService.deleteById(index);
    }

}
