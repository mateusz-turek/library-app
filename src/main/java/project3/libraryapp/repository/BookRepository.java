package project3.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project3.libraryapp.model.BookModel;

@Repository
public interface BookRepository extends CrudRepository<BookModel,Long> {
}
