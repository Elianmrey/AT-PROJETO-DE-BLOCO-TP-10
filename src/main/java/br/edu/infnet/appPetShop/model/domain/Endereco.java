package br.edu.infnet.appPetShop.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static org.hibernate.annotations.CascadeType.DELETE;

@Getter
@Setter
@Entity
@Table(name = "TabEndereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    @ManyToOne(cascade = CascadeType.DETACH)
    @Cascade({DELETE})
    @JoinColumn(name = "idSolicitante")
    @JsonBackReference
    private Solicitante solicitantes;


    @Override
    public String toString() {
        return cep +" ,"+ logradouro + " ," + complemento + " - " + bairro + localidade + uf;
    }




}