package com.example.demo.service;

import com.example.demo.model.Mahasiswa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MahasiswaService {
    List <Mahasiswa> listMahasiswa();
    Mahasiswa simpanOrupdate(Mahasiswa mahasiswa);
    Mahasiswa getId(Integer id);
    void hapus (Integer id);
}
