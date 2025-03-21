package com.example.axolotl_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/axolotls")
public class AxolotlController {

    private final AxolotlService service;

    public AxolotlController(AxolotlService service) {
        this.service = service;
    }

    @GetMapping
    public List<Axolotl> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Axolotl getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/search")
    public List<Axolotl> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }

    @GetMapping("/category")
    public List<Axolotl> getByColor(@RequestParam String color) {
        return service.getByColor(color);
    }

    @PostMapping
    public Axolotl add(@RequestBody Axolotl axolotl) {
        return service.save(axolotl);
    }

    @PutMapping("/{id}")
    public Axolotl update(@PathVariable Long id, @RequestBody Axolotl axolotl) {
        axolotl.setId(id); return service.save(axolotl);
    }

    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}