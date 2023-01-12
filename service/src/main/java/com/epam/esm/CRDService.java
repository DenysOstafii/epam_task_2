package com.epam.esm;

import java.util.List;

public interface CRDService<T> {

    T getById(int id);

    List<T> getAll();

    void insert(T item);

    void removeById(int id);
}
