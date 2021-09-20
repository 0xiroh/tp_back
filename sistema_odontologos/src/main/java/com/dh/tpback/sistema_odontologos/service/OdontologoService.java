package com.dh.tpback.sistema_odontologos.service;

import com.dh.tpback.sistema_odontologos.model.Odontologo;
import com.dh.tpback.sistema_odontologos.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OdontologoService {

    private final OdontologoRepository odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    //usando las funciones integradas del Jpa Repository, nos ahorramos escribir las sentencias en HQL

    public Odontologo registrarOdontologo(Odontologo odontologo){
        return odontologoRepository.save(odontologo);
    }

    public List<Odontologo> listarOdontologos(){
        return odontologoRepository.findAll();
    }

    public Optional<Odontologo> buscarOdontologo(Integer matricula){
        return odontologoRepository.buscarOdontologo(matricula);
    }




}
