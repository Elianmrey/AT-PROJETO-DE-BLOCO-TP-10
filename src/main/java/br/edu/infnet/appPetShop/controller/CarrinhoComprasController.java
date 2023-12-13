package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.CarrinhoCompras;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/api/carrinhocompras")
public class CarrinhoComprasController {
    //GET
    @GetMapping(value = "/listar")
    public List<CarrinhoCompras> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirCarrinho(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirCarrinho(@PathVariable Integer id){

    }
}
