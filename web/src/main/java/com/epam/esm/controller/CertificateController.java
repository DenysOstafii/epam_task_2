package com.epam.esm.controller;


import com.epam.esm.entity.Certificate;
import com.epam.esm.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping()
    public List<Certificate> allCertificates(Certificate certificate)
    {
        // All Certificates from DAO
        return certificateService.getAll();
    }
    @GetMapping("/{id}") //to our /certificate we will add "id"
    public Certificate certificateDyId(@PathVariable("id") int id, Certificate certificate){

        // We will get one Certificate by id from DAO
        return certificateService.geById(id);
    }

    @PostMapping
    public ResponseEntity<String> createCertificate(Certificate certificate){
        certificateService.insert(certificate);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success !");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCertificateById(@PathVariable int id){

        certificateService.removeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


   @PatchMapping
    public  ResponseEntity<String> updateCertificate(@PathVariable int id, @RequestMapping Certificate certificate){
        certificateService.update(id, certificate);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success !");
   }



}
