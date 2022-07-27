package com.id.latihan.latihanspring.model.aplikasiKasir;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "stok_barang")

public class StokBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stok_id;

    @ManyToOne
    @JoinColumn(name = "stok_type_dtl_id")
    private StokTypeDtl stok_type_dtl_id;

    @Column(length = 20)
    private String stok_code;

    @Column(length = 100)
    private String gram;

    @Column(length = 100)
    private String liter;

    @Column(length = 100)
    private String stok_name;

    @Column(length = 100)
    private String stok_type;

    @Column(length = 200)
    private String stok_desc;

    @Column(length = 100)
    private Long stok_price;

    @Column(length = 50)
    private Long jumlah_stok;

    @Column(length = 50)
    private Instant created_on;

    @Column(length = 100)
    private String created_by;

    @Column(length = 50)
    private Instant update_on;
    
    @Column(length = 100)
    private String update_by;

    @Column(length = 100)
    private String imageStok;

    public String getLiter() {
        return this.liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public String getStok_code() {
        return this.stok_code;
    }

    public void setStok_code(String stok_code) {
        this.stok_code = stok_code;
    }

    public String getGram() {
        return this.gram;
    }

    public void setGram(String gram) {
        this.gram = gram;
    }

    public Instant getCreated_on() {
        return this.created_on;
    }

    public void setCreated_on(Instant created_on) {
        this.created_on = created_on;
    }

    public Instant getUpdate_on() {
        return this.update_on;
    }

    public void setUpdate_on(Instant update_on) {
        this.update_on = update_on;
    }

    public String getImageStok() {
        return imageStok;
    }

    public void setImageStok(String imageStok) {
        this.imageStok = imageStok;
    }

    public Long getStok_id() {
        return stok_id;
    }

    public void setStok_id(Long stok_id) {
        this.stok_id = stok_id;
    }

    public StokTypeDtl getStok_type_dtl_id() {
        return stok_type_dtl_id;
    }

    public void setStok_type_dtl_id(StokTypeDtl stok_type_dtl_id) {
        this.stok_type_dtl_id = stok_type_dtl_id;
    }

    public String getStok_name() {
        return stok_name;
    }

    public void setStok_name(String stok_name) {
        this.stok_name = stok_name;
    }

    public String getStok_type() {
        return stok_type;
    }

    public void setStok_type(String stok_type) {
        this.stok_type = stok_type;
    }

    public String getStok_desc() {
        return stok_desc;
    }

    public void setStok_desc(String stok_desc) {
        this.stok_desc = stok_desc;
    }

    public Long getStok_price() {
        return stok_price;
    }

    public void setStok_price(Long stok_price) {
        this.stok_price = stok_price;
    }

    public Long getJumlah_stok() {
        return jumlah_stok;
    }

    public void setJumlah_stok(Long jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }


    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }


    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
}
