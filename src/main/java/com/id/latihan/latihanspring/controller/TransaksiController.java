package com.id.latihan.latihanspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.id.latihan.latihanspring.model.aplikasiKasir.Transaksikasir;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.TransaksiService;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiController {
    

    @Autowired
    TransaksiService service;

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> saveDatatransakasi(@RequestBody Transaksikasir transaksikasir){
        service.saveData(transaksikasir);
        return ResponseEntity.ok(new MessageResponse("success insert to databse")); 
    }

    
}
