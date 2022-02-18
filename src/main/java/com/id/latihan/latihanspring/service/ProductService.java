package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.aplikasiKasir.Product;
import com.id.latihan.latihanspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product productSave(Product product){
        return productRepository.save(product);
    }

    public Product findByidProduct (Long product_id){
        return productRepository.findById(product_id).orElse(null);
    }

    public String deletByIdProduct (Long product_id){
        productRepository.deleteById(product_id);
        return "product remove" + product_id;
    }

    public Product updateProductById (Product product){
        Product product1 = productRepository.findById(product.getProduct_id()).orElse(null);
        product1.setProduct_name(product.getProduct_name());

        return productRepository.save(product1);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


}
