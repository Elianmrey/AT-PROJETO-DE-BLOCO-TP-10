package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Solicitante;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/api/solicitante")
        public class SolicitanteController {

    //GET
    @GetMapping(value = "/listar")
    public List<Solicitante> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirSolicitante(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirSolicitante(@PathVariable Integer id){

    }


}
