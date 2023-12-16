package br.edu.infnet.appPetShop.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static java.util.logging.Level.ALL;
import static org.hibernate.annotations.CascadeType.*;

@Getter
@Setter
@Entity
@Table(name = "TabEndereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    @ManyToOne(cascade = CascadeType.DETACH)
    @Cascade({DELETE})
    @JoinColumn(name = "idSolicitante")
    @JsonBackReference
    Solicitante solicitante;


    @Override
    public String toString() {
        return "Rua: " + getLogradouro() + ", Número: " + getNumero() + " ," + getCidade() + " - " + getEstado() + ". CEP: " + getCep() + ". ";
    }
}