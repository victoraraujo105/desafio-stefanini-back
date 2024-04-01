package dev.victor.desafiostefanini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.victor.desafiostefanini.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    
}
