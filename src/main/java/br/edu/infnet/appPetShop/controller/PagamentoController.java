package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Pagamento;
import br.edu.infnet.appPetShop.model.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value ="/api/pagamento")
public class PagamentoController {


    @Autowired
    PagamentoService service;


    //GET
    @GetMapping(value = "/listar")
    public List<Pagamento> obterLista(){
        return service.obterPagamentos();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirPagamento(Pagamento pagamento){
    service.incluirPagamento(pagamento);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirPagamento(@PathVariable Integer id){
        service.excluirPagamento(id);
    }

}
