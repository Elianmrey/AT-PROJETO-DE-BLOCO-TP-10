package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Agendamento;
import br.edu.infnet.appPetShop.model.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value ="/api/agendamento")
public class AgendamentoController {

    @Autowired
    AgendamentoService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Agendamento> obterLista(){
        return (List<Agendamento>) service.obterAgendamentos();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirAgendamento(Agendamento agendamento){
        service.incluirAgendamento(agendamento);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirAgendamento(@PathVariable Integer id){
        service.excluirAgendamentos(id);
    }
}
