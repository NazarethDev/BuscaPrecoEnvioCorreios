package br.com.nazareth.ConsumoApiCorreios.obterDadosCliente;

import br.com.nazareth.ConsumoApiCorreios.consumo.ConsumoApi;
import br.com.nazareth.ConsumoApiCorreios.consumo.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaWeb {
    @Autowired
    private DadosDoEnvio dados;
    @Autowired
    private GeraUrlCorreios novaConsultaApi;

    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void pesquisa (){
        dados.obterDadosUsuario();
        var novaBusca = novaConsultaApi.getUrlBusca();
        System.out.println("URL da consulta: " + novaBusca);
        var dadosNovaBusca = consumo.obterDados(novaBusca);
        conversor.obterDados(dadosNovaBusca, RespostaCorreios.class);
    }
}
