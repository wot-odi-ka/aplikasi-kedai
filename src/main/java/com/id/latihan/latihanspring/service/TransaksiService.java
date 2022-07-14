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
        // Transaksikasir tr = new Transaksikasir();
        // tr.setCostumer_id(transaksikasir.getCostumer_id());
        // tr.setKaryawan_id(transaksikasir.getKaryawan_id());
        // tr.setProduct_id(transaksikasir.getProduct_id());
        // tr.setJenis_product(transaksikasir.getJenis_product());
        // tr.setHarga_product(transaksikasir.getHarga_product());
        // tr.setJumlah_product(transaksikasir.getJumlah_product());
        // tr.setTransaksi_code(transaksikasir.getTransaksi_code());
        int total = transaksikasir.getJumlah_product() * transaksikasir.getHarga_product();
        transaksikasir.setTotal(total);
        // tr.setCreate_by(transaksikasir.getCreate_by());
        // tr.setCreate_on(transaksikasir.getCreate_on());
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
