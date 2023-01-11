package com.epam.esm.controller;

import com.epam.esm.dao.CertificateDAO;
import com.epam.esm.entity.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateDAO certificateDAO;

    public CertificateController(CertificateDAO certificateDAO) {
        this.certificateDAO = certificateDAO;
    }

    @GetMapping()
    public String index(Certificate certificate)
    {
        // All Certificates from DAO
        return null;
    }
    @GetMapping("/{id}") //to our /certificate we will add "id"
    public String show(@PathVariable("id") int id, Certificate certificate){

        // We will get one Certificate by id from DAO
        return null;
    }
}
