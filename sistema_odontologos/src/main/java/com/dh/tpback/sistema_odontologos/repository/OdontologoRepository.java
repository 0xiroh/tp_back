package com.dh.tpback.sistema_odontologos.repository;

import com.dh.tpback.sistema_odontologos.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OdontologoRepository extends JpaRepository<Odontologo, Long> {

    @Query("FROM Odontologo WHERE matricula = ?1")
    Optional<Odontologo> buscarOdontologo(Integer matricula);


}
