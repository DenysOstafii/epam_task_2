package com.epam.esm.dao.impl;

import com.epam.esm.dao.AbstractDao;
import com.epam.esm.dao.CertificateDao;
import com.epam.esm.dao.TagDao;
import com.epam.esm.dao.mapper.CertificateRowMapper;
import com.epam.esm.entity.Certificate;
import com.epam.esm.entity.Tag;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CertificateDaoImpl extends AbstractDao<Certificate> implements CertificateDao {

    private static final String SELECT_BY_ID = "select from certificate where id = ?";
    private static final String SELECT_ALL_CERTIFICATES = "select * from certificate";
    private static final String DELETE_BY_ID = "delete from certificate where id = ?";
    private static final String UPDATE_CERTIFICATE = "";

    private TagDao tagDao;
    private CertificateRowMapper certificateRowMapper;

    public CertificateDaoImpl(JdbcTemplate jdbcTemplate, ResultSetExtractor<List<Certificate>> resultSetExtractor,
                              TagDao tagDao, CertificateRowMapper certificateRowMapper) {
        super(jdbcTemplate, resultSetExtractor);
        this.tagDao = tagDao;
        this.certificateRowMapper = certificateRowMapper;
    }

    @Override
    public Certificate getById(int id) {
        Certificate certificate = executeQueryForSingleEntity(SELECT_BY_ID, id);
        if(certificate==null) {
            throw new NullPointerException();
        }
        return certificate;
    }

    @Override
    public List<Certificate> getAll() {
        return null;
    }

    @Override
    public void insert(Certificate certificate) {

    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public void update(Certificate item) {

    }
}
