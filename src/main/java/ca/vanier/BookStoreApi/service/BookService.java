package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import ca.vanier.BookStoreApi.entity.Book;

public interface BookService {

    public Book save(Book book);

    public String delete(Long id);

    public Optional<Book> findById(Long id);

}
