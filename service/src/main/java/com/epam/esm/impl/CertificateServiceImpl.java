package com.epam.esm.impl;

import com.epam.esm.AbstractService;
import com.epam.esm.dao.CRDDao;
import com.epam.esm.dao.CertificateDao;
import com.epam.esm.dao.TagDao;
import com.epam.esm.entity.Certificate;
import com.epam.esm.service.CertificateService;

import java.util.List;

public class CertificateServiceImpl extends AbstractService<Certificate> implements CertificateService {

    private CertificateDao certificateDao;
    private TagDao tagDao;

    public CertificateServiceImpl(CRDDao<Certificate> dao, CertificateDao certificateDao, TagDao tagDao) {
        super(dao);
        this.certificateDao = certificateDao;
        this.tagDao = tagDao;
    }

    @Override
    public Certificate getById(int id) {
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
    public void update(int id, Certificate item) {

    }
}
