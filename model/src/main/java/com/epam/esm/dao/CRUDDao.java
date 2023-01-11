package com.epam.esm.dao;

import java.util.List;

public interface CRUDDao<T> {

     T getById();

     List<T> getAllItems();

     void insert (T item);

     int deleteById(int id);

}
