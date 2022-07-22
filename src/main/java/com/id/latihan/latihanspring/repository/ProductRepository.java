package com.id.latihan.latihanspring.repository;


import com.id.latihan.latihanspring.model.aplikasiKasir.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product,Long> {


    @Query(value = "select *,p.stok_id  from product p inner join stok_barang sb on sb.stok_id  = p.product_id", nativeQuery = true)
    List<Product> getAllProduct();
}
