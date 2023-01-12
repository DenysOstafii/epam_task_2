package com.epam.esm;

import com.epam.esm.dao.CRDDao;

import java.util.List;

public abstract class AbstractService<T> implements CRDService{
    private final CRDDao<T> dao;

    protected AbstractService(CRDDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public T getById(int id){
        return dao.getById(id);
    }

    @Override
    public List<T> getAll() {
        return dao.getAll();
    }

    @Override
    public void removeById(int id) {

        dao.removeById(id);
    }

}
