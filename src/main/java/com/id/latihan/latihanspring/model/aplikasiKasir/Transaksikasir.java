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
@Table(name = "transaksi")
public class Transaksikasir {

    @Id
    private Long transaksi_id;

    @Column(length = 100)
    private int product_id;

    @Column(length = 100)
    private int karyawan_id;

    @Column(length = 100)
    private int costumer_id;

    @Column(length = 100)
    private int jumlah_product;

    @Column(length = 100)
    private int harga_product;

    @Column(length = 50)
    private String jenis_product;

    @Column(length = 50)
    private Date create_on;

    @Column(length = 100)
    private String create_by;

    @Column(length = 50)
    private Date update_on;

    @Column(length = 100)
    private String update_by;

    @Column(length = 100)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(Long transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getKaryawan_id() {
        return karyawan_id;
    }

    public void setKaryawan_id(int karyawan_id) {
        this.karyawan_id = karyawan_id;
    }

    public int getCostumer_id() {
        return costumer_id;
    }

    public void setCostumer_id(int costumer_id) {
        this.costumer_id = costumer_id;
    }

    public int getJumlah_product() {
        return jumlah_product;
    }

    public void setJumlah_product(int jumlah_product) {
        this.jumlah_product = jumlah_product;
    }

    public int getHarga_product() {
        return harga_product;
    }

    public void setHarga_product(int harga_product) {
        this.harga_product = harga_product;
    }

    public String getJenis_product() {
        return jenis_product;
    }

    public void setJenis_product(String jenis_product) {
        this.jenis_product = jenis_product;
    }

    public Date getCreate_on() {
        return create_on;
    }

    public void setCreate_on(Date create_on) {
        this.create_on = create_on;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_on() {
        return update_on;
    }

    public void setUpdate_on(Date update_on) {
        this.update_on = update_on;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
}
