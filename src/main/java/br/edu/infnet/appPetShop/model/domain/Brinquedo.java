package br.edu.infnet.appPetShop.model.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TabBrinquedo")
public class Brinquedo extends Produto {

    private String tipo;
    private String tipoBrinquedo;
    private String fabricante;
    private int avaliacaoMedia;
    private int idadeRecomendada;
    private boolean reciclavel;


    @Override
    public String toString() {
        return "[Brinquedo]" + super.toString() + ";" + tipoBrinquedo + ";" + fabricante + ";" + avaliacaoMedia + ";" + idadeRecomendada;
    }

}