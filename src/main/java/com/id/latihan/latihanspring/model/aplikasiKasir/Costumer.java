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
@Table(name = "costumer")
public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long costumer_id;

    @Column(length = 20)
    private String costumer_code;

    public String getCostumer_code() {
        return this.costumer_code;
    }

    public void setCostumer_code(String costumer_code) {
        this.costumer_code = costumer_code;
    }

    @Column(length = 100)
    private String costumer_name;

    @Column(length = 13)
    private String no_handphone;

    @Column(length = 100)
    private String social_media;

    @Column(length = 10)
    private String jenis_kelamin;

    public Long getCostumer_id() {
        return costumer_id;
    }

    public void setCostumer_id(Long costumer_id) {
        this.costumer_id = costumer_id;
    }

    public String getCostumer_name() {
        return costumer_name;
    }

    public void setCostumer_name(String costumer_name) {
        this.costumer_name = costumer_name;
    }

    public String getNo_handphone() {
        return no_handphone;
    }

    public void setNo_handphone(String no_handphone) {
        this.no_handphone = no_handphone;
    }

    public String getSocial_media() {
        return social_media;
    }

    public void setSocial_media(String social_media) {
        this.social_media = social_media;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

}
