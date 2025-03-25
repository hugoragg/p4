package com.golfpassion.golfapi.service;

import com.golfpassion.golfapi.model.CampoDeGolf;
import com.golfpassion.golfapi.repository.CampoDeGolfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampoDeGolfService {

    @Autowired
    private CampoDeGolfRepository repo;

    public List<CampoDeGolf> listarTodos() {
        return repo.findAll();
    }

    public Optional<CampoDeGolf> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public CampoDeGolf guardar(CampoDeGolf campo) {
        return repo.save(campo);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
