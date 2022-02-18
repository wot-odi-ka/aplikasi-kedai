package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.aplikasiKasir.Costumer;
import com.id.latihan.latihanspring.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class CostumerService implements Serializable {

    @Autowired
    public CostumerRepository costumerRepository;

    public Costumer saveDataCostumer(Costumer costumer){
        return costumerRepository.save(costumer);
    }

    public Costumer updateDataCostumer(Costumer costumer){
        Costumer costumer1 = costumerRepository.findById(costumer.getCostumer_id()).orElse(null);
        return costumerRepository.save(costumer1);
    }

    public List<Costumer> getAllDataCostumer(){
        return costumerRepository.findAll();
    }

    public Costumer findDataCostumerById(Long costumer_id){
        return costumerRepository.findById(costumer_id).orElse(null);
    }

    public String deleteDataKaryawan(Long costumer_id){
        costumerRepository.deleteById(costumer_id);
        return null;
    }
}
