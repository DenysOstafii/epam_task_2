package com.epam.esm.dao.impl;

import com.epam.esm.dao.TagDao;
import com.epam.esm.entity.Tag;

import java.util.List;

public class TagDaoImpl implements TagDao<Tag> {

    private static final String SELECT_BY_ID = "select * from tag where id = ?";
    private static final String SELECT_BY_NAME = "select * from tag where tag_name like ?;";
    private static final String SELECT_ALL_TAGS = "select * from tag ";
    private static final String INSERT_TAG = "insert into tag(tag_name) values (?);";
    private static final String DELETE_BY_ID = "delete from tag where id = ?";



    @Override
    public Tag getById(long id) {

    }

    @Override
    public List getAll()  {
        return null;
    }

    @Override
    public void insert(Tag tag) {

    }

    @Override
    public void removeById(int id) {

    }
}
