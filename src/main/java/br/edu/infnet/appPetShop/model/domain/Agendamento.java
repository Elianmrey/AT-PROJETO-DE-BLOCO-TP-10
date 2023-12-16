package br.edu.infnet.appPetShop.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TabAgendamento")

public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgendamento;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "idServico")
    @JsonBackReference
    private Servico servico = new Servico();

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "idSolicitante")
    @JsonBackReference
    private Solicitante solicitante;

    private LocalDate dataHora;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "idCarrinho")
    @JsonBackReference
    CarrinhoCompras carrinhoCompras;


    @Override
    public String toString() {
        return servico.toString() + "; " + solicitante.toString() + "; " + dataHora + ". ";
    }
}
