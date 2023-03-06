package com.devtiro.dbprep.repositories;

import java.util.List;

import com.devtiro.dbprep.domain.Book;

public interface BookRepository {
    List<Book> listBooks();
}
