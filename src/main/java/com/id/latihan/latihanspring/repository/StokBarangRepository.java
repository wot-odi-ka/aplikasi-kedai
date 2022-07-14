package com.id.latihan.latihanspring.repository;

import com.id.latihan.latihanspring.model.aplikasiKasir.StokBarang;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StokBarangRepository extends JpaRepository<StokBarang,Long> {


    @Query(value = "select *,sb.stok_type_dtl_id from stok_barang sb inner join stok_type_dtl std on std.stok_type_dtl_id = sb.stok_id", nativeQuery = true)
            List<StokBarang> getDataStock();
}
