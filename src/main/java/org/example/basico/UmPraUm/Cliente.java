package org.example.basico.UmPraUm;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "assento_id",unique = true)
    private Assento assento;

    public Cliente(){

    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
