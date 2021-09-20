package com.dh.tpback.sistema_odontologos.controller;

import com.dh.tpback.sistema_odontologos.model.Paciente;
import com.dh.tpback.sistema_odontologos.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/{dni}")
    public ResponseEntity<Optional<Paciente>> buscarPaciente(@PathVariable Integer dni){
        return ResponseEntity.ok(pacienteService.buscarPaciente(dni));
    }

    @PostMapping()
    public ResponseEntity<Paciente> agregarPaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.registrarPaciente(paciente));
    }


}
