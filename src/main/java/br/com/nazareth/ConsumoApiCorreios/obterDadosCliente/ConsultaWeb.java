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
    @Autowired
    private ConsumoApi consumo;
    @Autowired
    private ConverteDados conversor;

    public void pesquisa (){

    }
}
