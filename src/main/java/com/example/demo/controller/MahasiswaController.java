package com.example.demo.controller;

import com.example.demo.model.Mahasiswa;
import com.example.demo.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MahasiswaController {

    private MahasiswaService mahasiswaService;
@Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @RequestMapping("/datasiswa")
    public String MahasiswaList(Model model){
        model.addAttribute("mahasiswa",mahasiswaService.listMahasiswa());


        return "data";

    }
    @RequestMapping(value = "datasiswa/create", method = RequestMethod.GET)
    public String tampilkanCreate(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "create";
    }
    @RequestMapping(value = "datasiswa/create", method = RequestMethod.POST)
    public String simpanData(Model model, Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa", mahasiswaService.simpanOrupdate(mahasiswa));
        return "redirect:";
    }
    @RequestMapping(value = "datasiswa/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id,Model model){
        model.addAttribute("mahasiswa", mahasiswaService.getId(id));
        return "create";

    }
    @RequestMapping(value = "datasiswa/hapus/{id}")
    public String hapus(@PathVariable Integer id){
       mahasiswaService.hapus(id);
        return "redirect:/datasiswa";

    }

}
