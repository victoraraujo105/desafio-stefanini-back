package dev.victor.desafiostefanini.model;

import java.time.LocalDate;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// CREATE TABLE user (
//     id SERIAL PRIMARY KEY,
//     nome TEXT NOT NULL,
//     email TEXT NOT NULL,
//     birthdate DATE NOT NULL,
//     created_at TIMESTAMP NOT NULL,
//     updated_at TIMESTAMP NOT NULL,
//     address_id INTEGER references address(id)
// );

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(generator = "users_id_seq")
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", allocationSize = 1)
    Long id;

    @Column(name = "nome")
    String nome;

    @Column(name = "email")
    String email;

    @Column(name = "data_nascimento")
    LocalDate dataNascimento;

    @Column(name = "data_criacao")
    LocalDate dataCriacao;
    
    @Column(name = "data_atualizacao")
    LocalDate dataAtualizacao;

    @Column(name = "id_endereco")
    Long idEndereco;
    
}
