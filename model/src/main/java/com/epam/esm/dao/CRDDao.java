package com.epam.esm.dao;

import java.util.List;

public interface CRDDao<T> {

    T getById(long id) ;

    List<T> getAll() ;

    void insert(T item) ;

    void removeById(int id) ;
}
