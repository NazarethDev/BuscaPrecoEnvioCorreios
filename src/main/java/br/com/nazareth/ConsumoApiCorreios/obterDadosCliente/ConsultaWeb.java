package br.com.nazareth.ConsumoApiCorreios.obterDadosCliente;

import br.com.nazareth.ConsumoApiCorreios.consumo.ConsumoApi;
import br.com.nazareth.ConsumoApiCorreios.consumo.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaWeb {
    private DadosDoEnvio dados;
    private GeraUrlCorreios novaConsultaApi;
    private ConsumoApi consumo;
    private ConverteDados conversor;

    public ConsultaWeb(DadosDoEnvio dados, GeraUrlCorreios novaConsultaApi, ConsumoApi consumo, ConverteDados conversor) {
        this.dados = dados;
        this.novaConsultaApi = novaConsultaApi;
        this.consumo = consumo;
        this.conversor = conversor;
    }

    public void pesquisa (){
        dados.obterDadosUsuario();
        var novaBusca = novaConsultaApi.getUrlBusca();
        System.out.println("URL da consulta: " + novaBusca);
        var info = consumo.obterDados(novaBusca);
        conversor.obterDados(info, RespostaCorreios.class);
    }
}
