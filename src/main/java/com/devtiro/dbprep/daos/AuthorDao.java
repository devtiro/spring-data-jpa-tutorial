package com.devtiro.dbprep.daos;

import java.util.Optional;

import com.devtiro.dbprep.domain.Author;

public interface AuthorDao {

    Optional<Author> getAuthorByBookIsbn(String isbn);

}
