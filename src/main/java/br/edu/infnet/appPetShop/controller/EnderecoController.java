package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Endereco;
import br.edu.infnet.appPetShop.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value ="/api/endereco")
public class EnderecoController {


    @Autowired
    EnderecoService service;


    //GET
    @GetMapping(value = "/listar")
    public List<Endereco> obterLista(){
        return (List<Endereco>)service.obterEnderecos();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirEndereco(Endereco endereco){
        service.incluirEndereco(endereco);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirEndereco(@PathVariable Integer id){
        service.excluirEndereco(id);
    }
}
