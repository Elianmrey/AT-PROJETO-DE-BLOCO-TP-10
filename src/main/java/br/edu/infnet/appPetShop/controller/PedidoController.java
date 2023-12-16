package br.edu.infnet.appPetShop.controller;

import br.edu.infnet.appPetShop.model.domain.Pedido;
import br.edu.infnet.appPetShop.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pedidos")
public class PedidoController {

    @Autowired
    PedidoService service;

    //GET
    @GetMapping(value = "/listar")
    public List<Pedido> obterLista() {
        return service.obterPedidos();
    }

    //POST
    @PostMapping(value = "/incluir", consumes="application/json")
    public void incluirPedido(@RequestBody Pedido pedido) {
        service.incluirPedido(pedido);

    }

    //DELETE
    @DeleteMapping(value = "/{id}/excluir")
    public void excluirPedido(@PathVariable Integer id) {
        service.excluirPedido(id);
    }
}
