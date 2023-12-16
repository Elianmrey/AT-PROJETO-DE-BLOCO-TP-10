package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Estoque;
import br.edu.infnet.appPetShop.model.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/estoques")
public class EstoqueController {


    @Autowired
    EstoqueService service;


    //GET
    @GetMapping(value = "/listar")
    public List<Estoque> obterLista() {
        return service.obterEstoque();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirEstoque(@RequestBody Estoque estoque) {
        service.incluirEstoque(estoque);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirEstoque(@PathVariable Integer id) {
        service.excluirEstoque(id);
    }
}
