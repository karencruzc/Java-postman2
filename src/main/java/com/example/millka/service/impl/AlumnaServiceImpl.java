package com.example.millka.service.impl;

import com.example.millka.model.Alumna;
import com.example.millka.service.AlumnaService;
import org.springframework.stereotype.Service;

@Service
public class AlumnaServiceImpl implements AlumnaService {

    public Alumna getAlumna() {
        Alumna millka = new Alumna();
        millka.setId(1);
        millka.setNombre("Millka");
        millka.setCurso("Java");
        millka.setEdad(2);

        return millka;
    }
}
