package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Servico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value ="/api/servico")
public class ServicoController {

    //GET
    @GetMapping(value = "/listar")
    public List<Servico> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirServico(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirServico(@PathVariable  Integer id){

    }
}
