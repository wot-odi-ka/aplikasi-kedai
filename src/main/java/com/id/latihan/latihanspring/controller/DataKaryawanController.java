package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.DataKaryawan;
import com.id.latihan.latihanspring.service.DataKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataKaryawanController {

    @Autowired
    private DataKaryawanService dataKaryawanService;

    @PostMapping("/addDataKaryawan")
    public DataKaryawan addDataKaryawan(@RequestBody DataKaryawan dataKaryawan){
        return dataKaryawanService.saveDataKaryawan(dataKaryawan);
    }

    @GetMapping("/dataKaryawan/{karyawan_id}")
    public DataKaryawan findDataKaryawanById(@PathVariable Long karyawan_id){
    return dataKaryawanService.getDataKaryawanById(karyawan_id);
    }

    @DeleteMapping("/deleteDataKaryawan")
    public String deleteDataKaryawanById(@PathVariable Long karyawan_id){
        return dataKaryawanService.deleteDataKaryawan(karyawan_id);
    }

    @GetMapping("/getAllDataKaryawan")
    public List<DataKaryawan> findAllDataKaryawan(){
        return dataKaryawanService.getAllDataKaryawan();
    }

    @PutMapping("/updateDataKaryawan")
    public DataKaryawan updateDataKaryawan(@RequestBody DataKaryawan dataKaryawan){
        return dataKaryawanService.updateDataKaryawan(dataKaryawan);
    }
}
