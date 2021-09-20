package com.dh.tpback.sistema_odontologos.service;

import com.dh.tpback.sistema_odontologos.model.Paciente;
import com.dh.tpback.sistema_odontologos.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Optional<Paciente> buscarPaciente(Integer dni){
        return pacienteRepository.buscarPaciente(dni);
    }

    public Paciente registrarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

}
