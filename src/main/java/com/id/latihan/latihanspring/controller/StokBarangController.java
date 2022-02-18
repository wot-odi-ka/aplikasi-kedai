package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.StokBarang;
import com.id.latihan.latihanspring.service.StokBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StokBarangController {

    @Autowired
    private StokBarangService stokBarangService;

    @PostMapping("/addStokBarang")
    public StokBarang addStokBarang(@RequestBody StokBarang stokBarang){
        return stokBarangService.saveStokeBarang(stokBarang);
    }

    @GetMapping("/getAllStokeBarang")
    public List<StokBarang> findAllStokBrang(){
        return stokBarangService.getAllStokBarang();
    }

    @DeleteMapping("/deleteStokBrang/{stok_id}")
    public String deletStokBarangById(@PathVariable Long stok_id){
        return stokBarangService.deleteStokBarangById(stok_id);
    }

    @PostMapping("/updateStokBarang")
    public StokBarang updateStokBarang(@RequestBody StokBarang stokBarang){
        return stokBarangService.updateStokBarang(stokBarang);
    }

    @GetMapping("/stokBarang/{stok_id}")
    public StokBarang stokBarangById(@PathVariable Long stok_id){
        return stokBarangService.stokBarangById(stok_id);
    }

}
