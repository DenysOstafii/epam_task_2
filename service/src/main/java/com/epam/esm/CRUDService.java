package com.epam.esm;

public interface CRUDService<T> extends CRDService<T> {

    void update(int id, T item);

}
