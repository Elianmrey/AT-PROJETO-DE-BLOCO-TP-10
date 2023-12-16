package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Catalogo;
import br.edu.infnet.appPetShop.model.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/catalogos")
public class CatalogoController {


    @Autowired
    CatalogoService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Catalogo> obterLista() {
        return (List<Catalogo>) service.obterCatalogos();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirCatalogo(@RequestBody Catalogo catalogo) {
        service.incluirCatalogo(catalogo);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirCatalogo(@PathVariable Integer id) {
        service.excluirCatalogo(id);
    }
}
