package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.aplikasiKasir.DataKaryawan;
import com.id.latihan.latihanspring.repository.DataKaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class DataKaryawanService implements Serializable {

    @Autowired
    private DataKaryawanRepository dataKaryawanRepository;

    public DataKaryawan saveDataKaryawan (DataKaryawan dataKaryawan){
        return dataKaryawanRepository.save(dataKaryawan);
    }

    public DataKaryawan getDataKaryawanById (Long karyawan_id){
        return dataKaryawanRepository.findById(karyawan_id).orElse(null);
    }

    public DataKaryawan updateDataKaryawan(DataKaryawan dataKaryawan){
        DataKaryawan dataKaryawan1 = dataKaryawanRepository.findById(dataKaryawan.getKaryawan_id()).orElse(null);
        dataKaryawan1.setName_karyawan(dataKaryawan.getName_karyawan());
        dataKaryawan1.setGender(dataKaryawan.getGender());
        dataKaryawan1.setAlamat(dataKaryawan.getAlamat());
        dataKaryawan1.setNo_hp(dataKaryawan.getNo_hp());
        dataKaryawan1.setStatus(dataKaryawan.getStatus());
        dataKaryawan1.setPosition_karyawan(dataKaryawan.getPosition_karyawan());
        return dataKaryawanRepository.save(dataKaryawan1);
    }

    public String deleteDataKaryawan (Long karyawan_id){
         dataKaryawanRepository.deleteById(karyawan_id);
         return null;
    }

    public List<DataKaryawan> getAllDataKaryawan(){
        return dataKaryawanRepository.findAll();
    }
}
