package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Brinquedo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value ="/api/brinquedo")
public class BrinquedoController {

    //GET
    @GetMapping(value = "/listar")
    public List<Brinquedo> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirBrinquedo(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirBrinquedo(@PathVariable Integer id){

    }
}
