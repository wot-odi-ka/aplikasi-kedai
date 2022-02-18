package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.Costumer;
import com.id.latihan.latihanspring.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostumerController {

    @Autowired
    private CostumerService costumerService;

    @PostMapping("/addDataCostumer")
    public Costumer addDataCostumer(@RequestBody Costumer costumer){
        return costumerService.saveDataCostumer(costumer);
    }

    @PostMapping("/updateDataCostumer")
    public Costumer updateDataCostumer(@RequestBody Costumer costumer){
        return costumerService.updateDataCostumer(costumer);
    }

    @GetMapping("/getAllCostumer")
    public List<Costumer> getAllCostomer(){
        return costumerService.getAllDataCostumer();
    }

    @GetMapping("/costumer/{costumer_id}")
    public Costumer findCostumerById(@PathVariable Long costumer_id){
        return costumerService.findDataCostumerById(costumer_id);
    }

    @DeleteMapping("/deleteCostomer/{costumer_id}")
    public String deleteCostumerById(@PathVariable Long costumer_id){
        return costumerService.deleteDataKaryawan(costumer_id);
    }
}
