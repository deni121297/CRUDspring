package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Mahasiswa {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nama;
    private Integer umur;
    private String alamat;
    private Integer npm;
    private String prodi;
    private String jurusan;
    private String kelas;

    @Version
    @Column(name = "optV",  columnDefinition = "integer DEFAULT 0")
    private Integer version;

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Integer getNpm() {
        return npm;
    }

    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
