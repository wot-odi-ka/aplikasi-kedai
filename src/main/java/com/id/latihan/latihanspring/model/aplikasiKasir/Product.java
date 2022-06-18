package com.id.latihan.latihanspring.model.aplikasiKasir;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "product")

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @ManyToOne
    @JoinColumn(name = "stok_id")
    private StokBarang stok_id;

    @Column(length = 20)
    private String product_Code;

    public String getProduct_Code() {
        return this.product_Code;
    }

    public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }

    @Column(length = 100)
    private String product_name;

    @Column(length = 500)
    private String product_desc;

    @Column(length = 50)
    private String product_type;

    @Column(length = 100)
    private long product_price;

    @Column(length = 100)
    private long jumlah_product;

    @Column(length = 50)
    private Date create_on;

    @Column(length = 100)
    private String create_by;

    @Column(length = 50)
    private Date update_on;

    @Column(length = 100)
    private String update_by;

    @Column(length = 100)
    private String imageProduct;

    @Column(length = 100)
    private String gram;

    @Column(length = 100)
    private String liter;

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public StokBarang getStok_id() {
        return stok_id;
    }

    public void setStok_id(StokBarang stok_id) {
        this.stok_id = stok_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public long getProduct_price() {
        return product_price;
    }

    public void setProduct_price(long product_price) {
        this.product_price = product_price;
    }

    public long getJumlah_product() {
        return jumlah_product;
    }

    public void setJumlah_product(long jumlah_product) {
        this.jumlah_product = jumlah_product;
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
