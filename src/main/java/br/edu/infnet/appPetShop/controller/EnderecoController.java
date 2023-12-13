package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Endereco;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value ="/api/endereco")
public class EnderecoController {

    //GET
    @GetMapping(value = "/listar")
    public List<Endereco> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirEndereco(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirEndereco(@PathVariable Integer id){

    }
}
