package com.aeropuerto.prueba.Aeropuerto.controllers;

import com.aeropuerto.prueba.Aeropuerto.model.Vuelos;
import com.aeropuerto.prueba.Aeropuerto.service.VuelosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class VuelosController {

        @Autowired
        private VuelosServiceImpl service;

        @GetMapping("/consulta/todos")
        public ResponseEntity<?> listar() {
            return ResponseEntity.ok().body(service.findAll());

        }
    @GetMapping("/consultaporvuelo/{type}")
    public ResponseEntity<?> listar(@PathVariable String type) {
        return ResponseEntity.ok().body(service.findPorTypo(type));

    }
    @PostMapping("/guardar")

    public ResponseEntity<?> save( @RequestBody Vuelos vuelos) {


        return ResponseEntity.ok().body(service.save(vuelos));

    }

    }
