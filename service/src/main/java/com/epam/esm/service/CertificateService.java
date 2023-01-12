package com.epam.esm.service;

import com.epam.esm.CRUDService;
import com.epam.esm.entity.Certificate;
import org.springframework.stereotype.Component;

@Component
public interface CertificateService extends CRUDService<Certificate> {
}
