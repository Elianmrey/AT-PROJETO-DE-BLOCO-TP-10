package br.edu.infnet.appPetShop.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "TabServico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServico;
    private double valor;
    private String categoria;
    private int avaliacao;
    private String nomeEspecialista;
    private String areaEspecialista;
    private String tipoAtendimento;
    private int codigo;

    @OneToMany
    @JoinColumn(name = "idServico")
    private Collection<Agendamento> agendamento;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    @JsonBackReference
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idCatalogo")
    @JsonBackReference
    private Catalogo catalogo;

    @Override
    public String toString() {
        return getValor() + ";" + getCategoria() + ";" + getAvaliacao() + ";" + getNomeEspecialista() + ";" + getAreaEspecialista() + ";" + getTipoAtendimento() + ";" + getCodigo();
    }

}