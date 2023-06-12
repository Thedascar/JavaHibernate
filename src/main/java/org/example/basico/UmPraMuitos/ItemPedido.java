package org.example.basico.UmPraMuitos;

import com.sun.istack.Nullable;
import org.example.basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;


    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double preco;

    public ItemPedido(){

    }

    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        this.setPedido(pedido);;
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null){
            this.setPreco(produto.getPreco());
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
