package br.com.nazareth.ConsumoApiCorreios.obterDadosCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeraUrlCorreios {

    @Autowired
    private DadosDoEnvio dados;


    public String getUrlBusca() {
        return parametrosEnvio();
    }

        private String parametrosEnvio() {
            StringBuffer parametros = new StringBuffer();

            parametros.append("https://apihom.correios.com.br/preco/v1/nacional/")
                    .append("04014?")
                    .append("cepDestino=").append(dados.getCepDestino())
                    .append("&cepOrigem=").append(dados.getCepOrigem())
                    .append("&peso=").append(dados.getPeso())
                    .append("&formato=").append(dados.getFormato())
                    .append("&comprimento=").append(dados.getComprimento())
                    .append("&altura=").append(dados.getAltura())
                    .append("&largura=").append(dados.getLargura())
                    .append("&diametro=").append(dados.getDiametro())
                    .append("&dMaoPropria=N")
                    .append("&valorDeclarado=").append(dados.getValorDeclarado())
                    .append("&avisoRecebimento=N");

            return parametros.toString();
        }

}
