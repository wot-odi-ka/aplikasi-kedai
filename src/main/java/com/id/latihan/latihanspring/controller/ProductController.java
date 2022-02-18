package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.aplikasiKasir.Product;
import com.id.latihan.latihanspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController  {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.productSave(product);
    }

    @GetMapping("/product/{product_id}")
    public Product findByIdProduct (@PathVariable Long product_id){
        return productService.findByidProduct(product_id);
    }

    @DeleteMapping("/product/{product_id}")
    public String delletByidProduct (@PathVariable Long product_id){
         return productService.deletByIdProduct(product_id);
    }

    @GetMapping("/getAllProduct")
    public List<Product> findAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping("/updateProduct")
    public Product updateDataProduct(@RequestBody  Product product){
        return productService.updateProductById(product);

    }
}
