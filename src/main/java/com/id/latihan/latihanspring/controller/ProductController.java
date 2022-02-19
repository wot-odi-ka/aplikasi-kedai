package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.Product;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController  {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<MessageResponse> addProduct(@RequestBody Product product){
         productService.productSave(product);
        return ResponseEntity.ok(new MessageResponse("success insert to databse"));
    }

    @GetMapping("/product/{product_id}")
    public Product findByIdProduct (@PathVariable Long product_id){
        return productService.findByidProduct(product_id);
    }

    @DeleteMapping("/product/{product_id}")
    public ResponseEntity<MessageResponse> delletByidProduct (@PathVariable Long product_id){
          productService.deletByIdProduct(product_id);
        return ResponseEntity.ok(new MessageResponse("success delete data id" + product_id));
    }

    @GetMapping("/getAllProduct")
    public List<Product> findAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<MessageResponse> updateDataProduct(@RequestBody  Product product){
         productService.updateProductById(product);
        return ResponseEntity.ok(new MessageResponse("success update to database"));

    }
}
