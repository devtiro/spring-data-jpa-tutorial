package com.devtiro.dbprep.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devtiro.dbprep.daos.BookDao;
import com.devtiro.dbprep.domain.Book;
import com.devtiro.dbprep.repositories.BookRepository;
import com.devtiro.dbprep.services.BookService;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.listBooks();
    }

}
