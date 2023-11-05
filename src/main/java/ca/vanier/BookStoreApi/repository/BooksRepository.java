package ca.vanier.BookStoreApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.BookStoreApi.entity.Book;

@Repository
public interface BooksRepository extends CrudRepository<Book, Long> {

}
