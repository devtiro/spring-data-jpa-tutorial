package com.devtiro.dbprep.repositories.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.devtiro.dbprep.daos.AuthorDao;
import com.devtiro.dbprep.daos.BookDao;
import com.devtiro.dbprep.domain.Author;
import com.devtiro.dbprep.domain.Book;
import com.devtiro.dbprep.repositories.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;

    private final AuthorDao authorDao;

    public BookRepositoryImpl(final BookDao bookDao, final AuthorDao authorDao) {
        this.bookDao = bookDao;
        this.authorDao = authorDao;
    }

    @Override
    public List<Book> listBooks() {
        return bookDao.listBooks().stream().map(book -> {
            final Author author = authorDao.getAuthorByBookIsbn(book.getIsbn()).orElse(null);
            book.setAuthor(author);
            return book;
        }).collect(Collectors.toList());
    }
}
