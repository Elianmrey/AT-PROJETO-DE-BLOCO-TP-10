package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Brinquedo;
import br.edu.infnet.appPetShop.model.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/brinquedos")
public class BrinquedoController {


    @Autowired
    BrinquedoService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Brinquedo> obterLista() {
        return service.obterBrinquedos();
    }

    //POST
    @PostMapping(value = "/incluir", consumes = {"application/json"})
    public void incluirBrinquedo(@RequestBody Brinquedo brinquedo) {
        service.incluirBrinquedo(brinquedo);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirBrinquedo(@PathVariable Integer id) {
        service.excluirBrinquedo(id);
    }
}
