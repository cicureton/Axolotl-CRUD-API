package com.example.axolotl_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface AxolotlRepository extends JpaRepository<Axolotl, Long> {
    List<Axolotl> findByNameContainingIgnoreCase(String name);
    List<Axolotl> findByColorIgnoreCase(String color);
}