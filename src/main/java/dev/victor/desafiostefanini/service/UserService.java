package dev.victor.desafiostefanini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.victor.desafiostefanini.model.Usuario;
import dev.victor.desafiostefanini.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Usuario> getUsuarios() {
        return userRepository.findAll();
    }

    public Usuario getUsuario(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }

}
