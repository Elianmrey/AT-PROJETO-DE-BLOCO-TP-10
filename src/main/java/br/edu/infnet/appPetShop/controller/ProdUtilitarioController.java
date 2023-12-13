package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.ProdUtilitario;
import br.edu.infnet.appPetShop.model.domain.Servico;
import br.edu.infnet.appPetShop.model.service.ProdUtilitarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value ="/api/produtoutilitario")
public class ProdUtilitarioController {

    @Autowired
    ProdUtilitarioService service;

    //GET
    @GetMapping(value = "/listar")
    public List<ProdUtilitario> obterLista(){
        return  service.obterProdUtilitarios();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirProdutoUtilitario(ProdUtilitario prodUtilitario){
        service.incluirProdUtilitario(prodUtilitario);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirProdutoUtilitario(@PathVariable Integer id){
    service.excluirProdUtilitrio(id);
    }
}
