package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.CarrinhoCompras;
import br.edu.infnet.appPetShop.model.service.CarrinhoComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/carrinhocompras")
public class CarrinhoComprasController {


    @Autowired
    CarrinhoComprasService service;


    //GET
    @GetMapping(value = "/listar")
    public List<CarrinhoCompras> obterLista() {
        return (List<CarrinhoCompras>) service.obterCarrinhoComprass();
    }


    //POST
    @PostMapping(value = "/incluir")
    public void incluirCarrinho(@RequestBody CarrinhoCompras carrinhoCompras) {
        service.incluirCarrinhoCompras(carrinhoCompras);
    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirCarrinho(@PathVariable Integer id) {
        service.excluirCarrinhoCompras(id);
    }
}
