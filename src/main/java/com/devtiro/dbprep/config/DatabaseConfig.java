package com.devtiro.dbprep.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfig {

    // @Bean
    // public DataSource getDataSource() {
    // final DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    // dataSourceBuilder.driverClassName("org.postgresql.Driver");
    // dataSourceBuilder.url("jdbc:postgresql://localhost:5432/postgres");
    // dataSourceBuilder.username("postgres");
    // dataSourceBuilder.password("example");
    // return dataSourceBuilder.build();
    // }

    @Bean
    public JdbcTemplate jdbcTemplate(final DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
