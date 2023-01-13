package com.epam.esm.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.util.List;

public class AbstractDao<T> {
    private JdbcTemplate jdbcTemplate;
    private ResultSetExtractor<List<T>> resultSetExtractor;

    public AbstractDao(JdbcTemplate jdbcTemplate, ResultSetExtractor<List<T>> resultSetExtractor) {
        this.jdbcTemplate = jdbcTemplate;
        this.resultSetExtractor = resultSetExtractor;
    }

    public List<T> executeQuery(String query, Object ... params){
        return jdbcTemplate.update(query,params);
    }

    public T executeQueryForSingleEntity(String query, Object ... params){
        List<T> items = executeQuery(query, params);
        if (items == null || items.size() == 0) {
            return null;
        }
        return items.get(0);
    }

    public int executeUpdate(String query, Object... params) {
        return jdbcTemplate.update(query, params);
    }

}
