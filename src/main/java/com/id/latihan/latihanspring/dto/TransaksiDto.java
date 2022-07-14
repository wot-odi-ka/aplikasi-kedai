package com.id.latihan.latihanspring.dto;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

    @Data
    @ToString
    public class TransaksiDto {

        private int id_transaksi;
        private int id_barang;
        private int id_pembeli;
        private String keterangan;
        private Date tanggal;
        private String nama_barang;
        private String nama_pembeli;
        private int harga;

        public int getId_transaksi() {
            return this.id_transaksi;
        }

        public void setId_transaksi(int id_transaksi) {
            this.id_transaksi = id_transaksi;
        }

        public int getId_barang() {
            return this.id_barang;
        }

        public void setId_barang(int id_barang) {
            this.id_barang = id_barang;
        }

        public int getId_pembeli() {
            return this.id_pembeli;
        }

        public void setId_pembeli(int id_pembeli) {
            this.id_pembeli = id_pembeli;
        }

        public String getKeterangan() {
            return this.keterangan;
        }

        public void setKeterangan(String keterangan) {
            this.keterangan = keterangan;
        }

        public Date getTanggal() {
            return this.tanggal;
        }

        public void setTanggal(Date tanggal) {
            this.tanggal = tanggal;
        }

        public String getNama_barang() {
            return this.nama_barang;
        }

        public void setNama_barang(String nama_barang) {
            this.nama_barang = nama_barang;
        }

        public String getNama_pembeli() {
            return this.nama_pembeli;
        }

        public void setNama_pembeli(String nama_pembeli) {
            this.nama_pembeli = nama_pembeli;
        }

        public int getHarga() {
            return this.harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

    }

