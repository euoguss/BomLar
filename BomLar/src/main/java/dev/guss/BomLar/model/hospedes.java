package dev.guss.BomLar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "hospedes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class hospedes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    Long cpf;
    String nome;
    String email;
    int idade;
}