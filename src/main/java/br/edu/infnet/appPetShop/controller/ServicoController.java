package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Servico;
import br.edu.infnet.appPetShop.model.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/servicos")
public class ServicoController {


    @Autowired
    ServicoService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Servico> obterLista() {
        return (List<Servico>) service.obterServicos();
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirServico(@RequestBody Servico servico) {
        service.incluirServico(servico);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirServico(@PathVariable Integer id) {
        service.excluirServico(id);
    }
}
