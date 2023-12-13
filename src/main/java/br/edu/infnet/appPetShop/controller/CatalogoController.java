package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Catalogo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class CatalogoController {
    //GET
    @GetMapping(value = "/listar")
    public List<Catalogo> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirCatalogo(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirCatalogo(@PathVariable Integer id){

    }
}
