package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Pagamento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value ="/api/pagamento")
public class PagamentoController {

    //GET
    @GetMapping(value = "/listar")
    public List<Pagamento> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirPagamento(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirPagamento(@PathVariable Integer id){

    }

}
