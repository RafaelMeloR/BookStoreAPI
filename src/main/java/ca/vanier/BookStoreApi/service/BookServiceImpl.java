package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.BookStoreApi.entity.Book;
import ca.vanier.BookStoreApi.repository.BooksRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public Book save(Book book) {
        return booksRepository.save(book);
    }

    @Override
    public String delete(Long id) {
        booksRepository.deleteById(id);
        return "Book deleted successfully";
    }

    @Override
    public Optional<Book> findById(Long id) {
        return booksRepository.findById(id);
    }

}
