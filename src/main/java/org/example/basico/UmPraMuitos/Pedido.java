package org.example.basico.UmPraMuitos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    @Column(nullable = false)
    public Date getData() {
        return data;
    }

    public Pedido(){
        this(new Date());
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
