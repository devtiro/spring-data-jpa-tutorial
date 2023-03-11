package com.devtiro.dbprep.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.devtiro.dbprep.domain.Book;

public interface BookService {

    Page<Book> getBooks(Pageable pageable);

    Optional<Book> getBook(String isbn);

}
