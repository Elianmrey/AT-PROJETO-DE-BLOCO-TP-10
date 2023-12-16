package br.edu.infnet.appPetShop.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TabProduto")
public abstract class Produto {


    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "tipo")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Brinquedo.class, name = "Brinquedo"),
            @JsonSubTypes.Type(value = ProdUtilitario.class, name = "ProdutoU"),
    })

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;
    private String nome;
    private double valor;
    private String categoria;
    private int codigo;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    @JsonBackReference
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idCatalogo")
    @JsonBackReference
    private Catalogo catalogo;

    @ManyToOne
    @JoinColumn(name = "idCarrinho")
    @JsonBackReference
    private CarrinhoCompras carrinhoCompras;

    @Override
    public String toString() {
        return nome + ";" + valor + ";" + categoria + ";" + codigo;
    }

}
