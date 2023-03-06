package com.devtiro.dbprep.daos.impl;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.devtiro.dbprep.daos.BookDao;
import com.devtiro.dbprep.domain.Book;

@Component
public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> listBooks() {
        return jdbcTemplate.query("select isbn, title from books", (ResultSet rs, int rowNum) -> {
            return Book.builder()
            .isbn(rs.getString("isbn"))
            .title(rs.getString("title"))
            .build();
        });
    }

}
