package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.Costumer;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
@RestController
@RequestMapping("/api/costumer")
public class CostumerController {

    @Autowired
    private CostumerService costumerService;

    @PostMapping("/addDataCostumer")
    public ResponseEntity<MessageResponse> addDataCostumer(@RequestBody Costumer costumer){
         costumerService.saveDataCostumer(costumer);
        return ResponseEntity.ok(new MessageResponse("success insert to database"));
    }

    @PostMapping("/updateDataCostumer")
    public ResponseEntity<MessageResponse> updateDataCostumer(@RequestBody Costumer costumer){
         costumerService.updateDataCostumer(costumer);
        return ResponseEntity.ok(new MessageResponse("success update data"));
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
    public ResponseEntity<MessageResponse> deleteCostumerById(@PathVariable Long costumer_id){
         costumerService.deleteDataKaryawan(costumer_id);
        return ResponseEntity.ok(new MessageResponse("success delete data id : " + costumer_id));
    }
}
