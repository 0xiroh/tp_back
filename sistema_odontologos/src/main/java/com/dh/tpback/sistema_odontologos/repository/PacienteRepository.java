package com.dh.tpback.sistema_odontologos.repository;

import com.dh.tpback.sistema_odontologos.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT u FROM Paciente u WHERE u.dni =?1")
    Optional<Paciente> buscarPaciente(Integer dni);

    @Query("DELETE Paciente WHERE dni =?1")
    void eliminarPaciente(Integer dni);
}
