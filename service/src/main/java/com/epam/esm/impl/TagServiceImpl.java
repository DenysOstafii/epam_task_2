package com.epam.esm.impl;

import com.epam.esm.AbstractService;
import com.epam.esm.dao.CRDDao;
import com.epam.esm.entity.Tag;
import com.epam.esm.service.TagService;

import java.util.List;

public class TagServiceImpl extends AbstractService<Tag> implements TagService {

    public TagServiceImpl(CRDDao<Tag> dao) {
        super(dao);
    }

    @Override
    public Tag getById(int id) {
        return null;
    }

    @Override
    public List<Tag> getAll() {
        return null;
    }

    @Override
    public void insert(Tag tag) {

    }

    @Override
    public void removeById(int id) {

    }
}
