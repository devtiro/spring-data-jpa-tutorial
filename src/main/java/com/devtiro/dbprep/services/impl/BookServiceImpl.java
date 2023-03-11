package com.devtiro.dbprep.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Book> getBooks(final Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Optional<Book> getBook(String isbn) {
        return bookRepository.findById(isbn);
    }

}
