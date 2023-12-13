package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Pedido;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/api/pedido")
public class PedidoController {


    //GET
    @GetMapping(value = "/listar")
    public List<Pedido> obterLista(){
        return null;
    }

    //POST
    @PostMapping(value = "/incluir")
    public void incluirPedido(){

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirPedido(@PathVariable Integer id){

    }
}
