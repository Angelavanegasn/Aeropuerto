package com.aeropuerto.prueba.Aeropuerto.service;

import com.aeropuerto.prueba.Aeropuerto.model.Vuelos;

import java.util.Optional;

public interface VuelosService {

    public Iterable<Vuelos> findAll();
    public Optional<Vuelos> findById(Long id);
    public Vuelos save(Vuelos vuelos);
    public void deleteById(Long id);
}
