package com.dh.tpback.sistema_odontologos.controller;


import com.dh.tpback.sistema_odontologos.model.Odontologo;
import com.dh.tpback.sistema_odontologos.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
@CrossOrigin("*")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping()
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.registrarOdontologo(odontologo));
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Optional<Odontologo>> buscarOdontologo(@PathVariable Integer matricula) {
        return ResponseEntity.ok(odontologoService.buscarOdontologo(matricula));
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Odontologo>> listarTodos(){
        return ResponseEntity.ok(odontologoService.listarOdontologos());
    }










}
