package com.aeropuerto.prueba.Aeropuerto.service;

import com.aeropuerto.prueba.Aeropuerto.model.Vuelos;
import com.aeropuerto.prueba.Aeropuerto.repository.VuelosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class VuelosServiceImpl implements VuelosService{


    @Autowired
    private VuelosRepository repository;

    @Transactional(readOnly = true)
    public Iterable<Vuelos> findAll() {
        return repository.findAll();
    }
    @Transactional(readOnly = true)
    public Iterable<Vuelos> findPorTypo(String typeVuelo) {
        return repository.consultarPorTipo(typeVuelo);
    }

    @Transactional(readOnly = true)
    public Optional<Vuelos> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Vuelos save(Vuelos alumno) {
        return repository.save(alumno);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);

    }



}
