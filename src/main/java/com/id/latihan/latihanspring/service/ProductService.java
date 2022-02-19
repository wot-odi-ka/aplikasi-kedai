package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.User;
import com.id.latihan.latihanspring.model.aplikasiKasir.Product;
import com.id.latihan.latihanspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        product1.setProduct_desc(product.getProduct_desc());
        product1.setJumlah_product(product.getJumlah_product());
        product1.setProduct_price(product.getProduct_price());
        product1.setCreate_by(product.getCreate_by());
        product1.setCreate_on(new Date());
        product1.setUpdate_by(product.getUpdate_by());
        product1.setUpdate_on(new Date());
        return productRepository.save(product1);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


}
