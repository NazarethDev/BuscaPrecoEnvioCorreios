package br.com.nazareth.ConsumoApiCorreios.obterDadosCliente;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RespostaCorreios(
        @JsonAlias()
        String Codigo,
        String Valor,
        String PrazoEntrega,
        String ValorSemAdicionais,
        String ValorMaoPropria,
        String ValorAvisoRecebimento,
        String ValorDeclarado,
        String EntregaDomiciliar,
        String EntregaSabado,
        String Erro,
        String MsgErro
) {}
