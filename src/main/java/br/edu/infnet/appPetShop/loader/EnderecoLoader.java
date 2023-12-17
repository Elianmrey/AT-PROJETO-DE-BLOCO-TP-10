package br.edu.infnet.appPetShop.loader;

import br.edu.infnet.appPetShop.model.domain.Endereco;
import br.edu.infnet.appPetShop.model.domain.Solicitante;
import br.edu.infnet.appPetShop.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
@Order(2)
public class EnderecoLoader implements ApplicationRunner {


    @Autowired
    EnderecoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        final String rota = "files/Enderecos.txt";
        FileReader arquivo;
        arquivo = new FileReader(rota);
        BufferedReader leitordeLinha = new BufferedReader(arquivo);

        String leitura = leitordeLinha.readLine();
        String[] dataSet;

        while (leitura != null) {

            dataSet = leitura.split(";");


            Endereco endereco = service.buscarCEP(dataSet[0]);

            Solicitante solicitante = new Solicitante();
            solicitante.setIdSolicitante(Integer.parseInt(dataSet[1]));

            endereco.setSolicitantes(solicitante);
            service.incluirEndereco(endereco);

            leitura = leitordeLinha.readLine();
        }
        for (Endereco Endereco : service.obterEnderecos()) {
            System.out.println("[Endereco:] " + Endereco);
        }
    }

}
