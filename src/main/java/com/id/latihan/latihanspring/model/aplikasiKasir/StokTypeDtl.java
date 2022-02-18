package com.id.latihan.latihanspring.model.aplikasiKasir;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "stok_type_dtl")
public class StokTypeDtl {

    @Id
    private Long stok_type_dtl_id;

    @Column(length = 100)
    private String stok_name_dtl;

    @Column(length = 100)
    private String stok_harga_dtl;

    public Long getStok_type_dtl_id() {
        return stok_type_dtl_id;
    }

    public void setStok_type_dtl_id(Long stok_type_dtl_id) {
        this.stok_type_dtl_id = stok_type_dtl_id;
    }

    public String getStok_name_dtl() {
        return stok_name_dtl;
    }

    public void setStok_name_dtl(String stok_name_dtl) {
        this.stok_name_dtl = stok_name_dtl;
    }

    public String getStok_harga_dtl() {
        return stok_harga_dtl;
    }

    public void setStok_harga_dtl(String stok_harga_dtl) {
        this.stok_harga_dtl = stok_harga_dtl;
    }
}
