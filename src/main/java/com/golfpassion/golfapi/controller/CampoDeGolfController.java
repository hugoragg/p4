package com.golfpassion.golfapi.controller;

import com.golfpassion.golfapi.model.CampoDeGolf;
import com.golfpassion.golfapi.service.CampoDeGolfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campos")
public class CampoDeGolfController {

    @Autowired
    private CampoDeGolfService service;

    // 🔎 LEER todos los campos
    @GetMapping
    public List<CampoDeGolf> listar() {
        return service.listarTodos();
    }

    // 🔎 LEER un campo por ID
    @GetMapping("/{id}")
    public ResponseEntity<CampoDeGolf> obtener(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ➕ CREAR un nuevo campo
    @PostMapping
    public CampoDeGolf crear(@RequestBody CampoDeGolf campo) {
        return service.guardar(campo);
    }

    // ✏️ ACTUALIZAR un campo existente
    @PutMapping("/{id}")
    public ResponseEntity<CampoDeGolf> actualizar(@PathVariable Long id, @RequestBody CampoDeGolf nuevoCampo) {
        return service.obtenerPorId(id).map(campo -> {
            campo.setNombre(nuevoCampo.getNombre());
            campo.setUbicacion(nuevoCampo.getUbicacion());
            campo.setDescripcion(nuevoCampo.getDescripcion());
            return ResponseEntity.ok(service.guardar(campo));
        }).orElse(ResponseEntity.notFound().build());
    }

    // 🗑 BORRAR un campo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.obtenerPorId(id).isPresent()) {
            service.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
