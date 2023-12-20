package com.example.millka.controller;

import com.example.millka.model.Alumna;
import com.example.millka.service.AlumnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("alumnas")
@RestController
public class MillkaController {
    @Autowired
    private AlumnaService alumnaService;

    @GetMapping("/get-alumna")
    public Alumna alumna1(){
        return  alumnaService.getAlumna();
    }

}
