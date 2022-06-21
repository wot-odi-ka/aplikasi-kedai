package com.id.latihan.latihanspring.repository;

import com.id.latihan.latihanspring.model.aplikasiKasir.Transaksikasir;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksikasir,Long> {


}
