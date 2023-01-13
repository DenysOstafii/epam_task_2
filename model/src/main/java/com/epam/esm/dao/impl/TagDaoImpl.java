package com.epam.esm.dao.impl;

import com.epam.esm.dao.AbstractDao;
import com.epam.esm.dao.TagDao;
import com.epam.esm.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class TagDaoImpl extends AbstractDao<Tag> implements TagDao<Tag> {

    private static final String SELECT_BY_ID = "select * from tag where id = ?";
    private static final String SELECT_BY_NAME = "select * from tag where tag_name like ?;";
    private static final String SELECT_ALL_TAGS = "select * from tag ";
    private static final String INSERT_TAG = "insert into tag(tag_name) values (?);";
    private static final String DELETE_BY_ID = "delete from tag where id = ?";


    @Autowired
    public TagDaoImpl(JdbcTemplate jdbcTemplate, ResultSetExtractor<List<Tag>> resultSetExtractor) {
        super(jdbcTemplate, resultSetExtractor);
    }

    @Override
    public Tag getById(int id) {
          Tag tag = executeQueryForSingleEntity(SELECT_BY_ID, id);
          if(tag==null) throw new NullPointerException();
          return tag;
    }

    @Override
    public List<Tag> getAll()  {
        List<Tag> tags = executeQuery(SELECT_ALL_TAGS);
        return tags;
    }

    @Override
    @Transactional
    public void insert(Tag tag) {
        executeUpdate(INSERT_TAG, tag);
    }

    @Override
    public void removeById(int id) {
        int result = executeUpdate(DELETE_BY_ID, id);
        if(result==0){
            throw new NullPointerException();
        }
    }
}
