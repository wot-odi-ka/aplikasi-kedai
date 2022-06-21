package com.id.latihan.latihanspring.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.latihan.latihanspring.model.aplikasiKasir.Transaksikasir;
import com.id.latihan.latihanspring.repository.TransaksiRepository;

@Service
public class TransaksiService implements Serializable  {

    @Autowired
    private TransaksiRepository repository;


    public Transaksikasir saveData(Transaksikasir transaksikasir){

        return repository.save(transaksikasir);
    }

    public List<Transaksikasir> getDataAllTransaksi(){
        return repository.findAll();
    }

    public Optional<Transaksikasir> findById(Long id){
        return repository.findById(id);
    }

    public Transaksikasir updateData(Transaksikasir t){
        Transaksikasir transaksikasir = repository.findById(t.getTransaksi_id()).orElse(null);

        return repository.save(transaksikasir);
    }


}
