package com.senai.eli.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "gt")
@Entity
@Getter
@Setter
public class Gt {

   @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao do grupo", nullable = false)
    private String descricao;

    @Column(name = "responsavel")
    private String responsavel;

    @Column(name = "valor")
    private double valor;

    @Column(name = "email de contato")
    private String emaildecontato;

    @Column(name = "nome", nullable = false)
    private String nome;


    public Gt() {
    }

    public Gt(String email, String descricao, Long id, String responsavel, String nome) {
        this.emaildecontato = email;
        this.descricao = descricao;
        this.id = id;
        this.responsavel = responsavel;
        this.nome = nome;
    }

}
