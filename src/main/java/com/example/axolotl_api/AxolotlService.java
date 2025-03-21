package com.example.axolotl_api;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AxolotlService {

    private final AxolotlRepository repository;

    public AxolotlService(AxolotlRepository repository) {
        this.repository = repository;
    }

    public List<Axolotl> getAll() {
        return repository.findAll();
    }

    public Axolotl getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Axolotl> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<Axolotl> getByColor(String color) {
        return repository.findByColorIgnoreCase(color);
    }

    public Axolotl save(Axolotl axolotl) {
        return repository.save(axolotl);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
