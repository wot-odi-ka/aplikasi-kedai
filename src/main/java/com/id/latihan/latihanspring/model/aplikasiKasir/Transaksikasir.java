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
@Table(name = "transaksi")
public class Transaksikasir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaksi_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

    @ManyToOne
    @JoinColumn(name = "karyawan_id")
    private DataKaryawan karyawan_id;

    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer_id;

    @Column(length = 20)
    private String transaksi_code;

    @Column(length = 100)
    private int jumlah_product;

    @Column(length = 100)
    private int harga_product;

    @Column(length = 50)
    private String jenis_product;

    @Column(length = 50)
    private Instant create_on;

	public Instant getCreate_on() {
		return this.create_on;
	}

	public void setCreate_on(Instant create_on) {
		this.create_on = create_on;
	}


    @Column(length = 100)
    private String create_by;

    @Column(length = 50)
    private Instant update_on;

    public Instant getUpdate_on() {
        return this.update_on;
    }

    public void setUpdate_on(Instant update_on) {
        this.update_on = update_on;
    }

    @Column(length = 100)
    private String update_by;

    @Column(length = 100)
    private String image;

    @Column(length = 100)
    private int total;

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTransaksi_code() {
        return this.transaksi_code;
    }

    public void setTransaksi_code(String transaksi_code) {
        this.transaksi_code = transaksi_code;
    }


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

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public DataKaryawan getKaryawan_id() {
        return karyawan_id;
    }

    public void setKaryawan_id(DataKaryawan karyawan_id) {
        this.karyawan_id = karyawan_id;
    }

    public Costumer getCostumer_id() {
        return costumer_id;
    }

    public void setCostumer_id(Costumer costumer_id) {
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

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

}
