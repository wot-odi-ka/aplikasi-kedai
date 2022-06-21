package com.id.latihan.latihanspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.id.latihan.latihanspring.model.aplikasiKasir.Transaksikasir;
import com.id.latihan.latihanspring.service.TransaksiService;

@RestController
@RequestMapping("api/transaksi")
public class TransaksiController {
    

    @Autowired
    TransaksiService service;

    public Transaksikasir saveDatatransakasi(Transaksikasir transaksikasir){

        return service.saveData(transaksikasir);
    }

    
}
