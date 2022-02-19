package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.StokBarang;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.StokBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stokBarang")
public class StokBarangController {

    @Autowired
    private StokBarangService stokBarangService;

    @PostMapping("/addStokBarang")
    public ResponseEntity<MessageResponse> addStokBarang(@RequestBody StokBarang stokBarang){
         stokBarangService.saveStokeBarang(stokBarang);
        return ResponseEntity.ok(new MessageResponse("success insert to database"));
    }

    @GetMapping("/getAllStokeBarang")
    public List<StokBarang> findAllStokBrang(){
        return stokBarangService.getAllStokBarang();
    }

    @DeleteMapping("/deleteStokBrang/{stok_id}")
    public ResponseEntity<MessageResponse> deletStokBarangById(@PathVariable Long stok_id){
         stokBarangService.deleteStokBarangById(stok_id);
        return ResponseEntity.ok(new MessageResponse("success delete data id :" + stok_id));
    }

    @PostMapping("/updateStokBarang")
    public ResponseEntity<MessageResponse> updateStokBarang(@RequestBody StokBarang stokBarang){
         stokBarangService.updateStokBarang(stokBarang);
        return ResponseEntity.ok(new MessageResponse("success update data"));
    }

    @GetMapping("/stokBarang/{stok_id}")
    public StokBarang stokBarangById(@PathVariable Long stok_id){
        return stokBarangService.stokBarangById(stok_id);
    }

}
