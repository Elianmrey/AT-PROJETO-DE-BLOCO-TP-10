package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Agendamento;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/api/agendamento")
public class AgendamentoController {

    //GET
    @GetMapping(value = "/listar")
    public List<Agendamento> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirAgendamento(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirAgendamento(@PathVariable Integer id){

    }
}
