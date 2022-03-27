package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.DataKaryawan;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.DataKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
@RestController
@RequestMapping("/api/dataKaryawan")
public class DataKaryawanController {

    @Autowired
    private DataKaryawanService dataKaryawanService;

    @PostMapping("/addDataKaryawan")
    public ResponseEntity<MessageResponse> addDataKaryawan(@RequestBody DataKaryawan dataKaryawan){
         dataKaryawanService.saveDataKaryawan(dataKaryawan);
        return ResponseEntity.ok(new MessageResponse("success insert to database"));
    }

    @GetMapping("/dataKaryawan/{karyawan_id}")
    public DataKaryawan findDataKaryawanById(@PathVariable Long karyawan_id){
    return dataKaryawanService.getDataKaryawanById(karyawan_id);
    }

    @DeleteMapping("/deleteDataKaryawan/{karyawan_id}")
    public ResponseEntity<MessageResponse> deleteDataKaryawanById(@PathVariable Long karyawan_id){
        dataKaryawanService.deleteDataKaryawan(karyawan_id);
        return ResponseEntity.ok(new MessageResponse("success delete data id" +karyawan_id));
    }

    @GetMapping("/getAllDataKaryawan")
    public List<DataKaryawan> findAllDataKaryawan(){
        return dataKaryawanService.getAllDataKaryawan();
    }

    @PutMapping("/updateDataKaryawan")
    public ResponseEntity<MessageResponse> updateDataKaryawan(@RequestBody DataKaryawan dataKaryawan){
         dataKaryawanService.updateDataKaryawan(dataKaryawan);
        return ResponseEntity.ok(new MessageResponse("success update data"));
    }
}
