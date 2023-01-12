package com.epam.esm.dao.impl;

import com.epam.esm.dao.CertificateDao;
import com.epam.esm.dao.TagDao;
import com.epam.esm.dao.mapper.CertificateRowMapper;
import com.epam.esm.entity.Certificate;
import com.epam.esm.entity.Tag;

import java.util.List;

public class CertificateDaoImpl implements CertificateDao {

    private static final String SELECT_BY_ID = "select from certificate where id = ?";
    private static final String SELECT_ALL_CERTIFICATES = "select * from certificate";
    private static final String DELETE_BY_ID = "delete from certificate where id = ?";
    private static final String UPDATE_CERTIFICATE = "";

    private TagDao tagDao;
    private CertificateRowMapper certificateRowMapper;

    @Override
    public Certificate getById(long id) {
        return null;
    }

    @Override
    public List<Certificate> getAll() {
        return null;
    }

    @Override
    public void insert(Certificate item) {

    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public void update(Certificate item) {

    }
}
