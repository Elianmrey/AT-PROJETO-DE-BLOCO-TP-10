package br.edu.infnet.appPetShop.model.service;

import br.edu.infnet.appPetShop.model.domain.Brinquedo;
import br.edu.infnet.appPetShop.model.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BrinquedoService {

    @Autowired
    BrinquedoRepository brinquedoRepository;

    public void incluirBrinquedo(Brinquedo brinquedo)
    {
        brinquedoRepository.save(brinquedo);
    }

    public List<Brinquedo> obterBrinquedos(){

        return (List<Brinquedo>)brinquedoRepository.findAll();
    }
    public void excluirBrinquedo(Integer id){brinquedoRepository.deleteById(id);}
}
