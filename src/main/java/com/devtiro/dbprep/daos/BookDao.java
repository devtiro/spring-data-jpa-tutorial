package com.devtiro.dbprep.daos;

import java.util.List;

import com.devtiro.dbprep.domain.Book;

public interface BookDao {

    List<Book> listBooks();

}
