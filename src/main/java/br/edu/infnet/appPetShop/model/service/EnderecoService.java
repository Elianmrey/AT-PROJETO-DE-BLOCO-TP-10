package br.edu.infnet.appPetShop.model.service;

import br.edu.infnet.appPetShop.Clients.IEnderecoClient;
import br.edu.infnet.appPetShop.model.domain.Endereco;
import br.edu.infnet.appPetShop.model.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EnderecoService {


    @Autowired
    IEnderecoClient enerecoClient;

    public Endereco buscarCEP(String cep) {
        return enerecoClient.buscarCEP(cep);
    }


    @Autowired
    EnderecoRepository enderecoRepository;


    public void incluirEndereco(Endereco Endereco) {
        enderecoRepository.save(Endereco);
    }

    public Collection<Endereco> obterEnderecos() {
        return (Collection<Endereco>) enderecoRepository.findAll();
    }

    public void excluirEndereco(Integer id) {

        enderecoRepository.deleteById(id);
    }


}
