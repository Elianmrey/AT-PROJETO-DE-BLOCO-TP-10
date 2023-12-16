package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Solicitante;
import br.edu.infnet.appPetShop.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/solicitantes")
public class SolicitanteController {


    @Autowired
    SolicitanteService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Solicitante> obterLista() {
        return (List<Solicitante>) service.obterSolicitantes();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirSolicitante(@RequestBody Solicitante solicitante) {
        service.incluirSolicitante(solicitante);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirSolicitante(@PathVariable Integer id) {
        service.excluirSolicitante(id);
    }


}
