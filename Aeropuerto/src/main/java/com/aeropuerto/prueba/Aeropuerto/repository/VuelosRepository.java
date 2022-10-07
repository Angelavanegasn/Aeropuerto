package com.aeropuerto.prueba.Aeropuerto.repository;

import com.aeropuerto.prueba.Aeropuerto.model.Vuelos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelosRepository extends CrudRepository <Vuelos, Long>{

    @Query
            (
                    nativeQuery = true,
                    value = "select * from vuelos WHERE type_vuelo =:typeVuelo"
            )
    public Iterable<Vuelos> consultarPorTipo(@Param("typeVuelo") String typeVuelo );


}
