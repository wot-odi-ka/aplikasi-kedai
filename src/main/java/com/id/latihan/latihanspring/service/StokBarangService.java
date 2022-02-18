package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.aplikasiKasir.StokBarang;
import com.id.latihan.latihanspring.repository.StokBarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class StokBarangService implements Serializable {

    @Autowired
    private StokBarangRepository stokBarangRepository;

    public StokBarang saveStokeBarang(StokBarang stokBarang){
        return stokBarangRepository.save(stokBarang);
    }

    public StokBarang stokBarangById(Long stok_id){
        return stokBarangRepository.findById(stok_id).orElse(null);
    }

    public  StokBarang updateStokBarang (StokBarang stokBarang){
        StokBarang stokBarang1 = stokBarangRepository.findById(stokBarang.getStok_id()).orElse(null);
        return stokBarangRepository.save(stokBarang1);
    }

    public String deleteStokBarangById(Long stok_id){
         stokBarangRepository.deleteById(stok_id);
         return null;
    }

    public List<StokBarang> getAllStokBarang(){
        return stokBarangRepository.findAll();
    }
}