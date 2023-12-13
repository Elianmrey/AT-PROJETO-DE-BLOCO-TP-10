package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Servico;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/api/produtoutilitario")
public class ProdUtilitarioController {
    //GET
    @GetMapping(value = "/listar")
    public List<Servico> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirProdutoUtilitario(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirProdutoUtilitario(@PathVariable Integer id){

    }
}
