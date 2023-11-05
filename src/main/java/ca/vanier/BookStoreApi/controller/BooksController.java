package ca.vanier.BookStoreApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.BookStoreApi.entity.Book;
import ca.vanier.BookStoreApi.service.BookService;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService booksService;

    @PostMapping("/save")
    public Book save(@RequestBody Book book) {
        System.out.println("Book saved successfully");
        return booksService.save(book);
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        return booksService.delete(id);
    }

    @GetMapping("/findById")
    public Optional<Book> findById(@RequestParam Long id) {
        System.out.println("Book found successfully");
        return booksService.findById(id);
    }

}
