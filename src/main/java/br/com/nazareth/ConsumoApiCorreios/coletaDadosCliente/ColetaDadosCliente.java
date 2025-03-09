package br.com.nazareth.ConsumoApiCorreios.coletaDadosCliente;

import java.util.Scanner;

public class ColetaDadosCliente {
    private String cepOrigem;
    private String cepDestino;
    private String peso;
    private String formato;
    private String comprimento;
    private String altura;
    private String largura;
    private String diametro;
    private String valorDeclarado;
    private Scanner scanner = new Scanner(System.in);

    public void obterDados(){
        System.out.println("Por favor, responda todas as perguntas com números naturais! (inteiros e > 0");
        System.out.println("Por favor, informe o CEP de origem do envio: ");
        cepOrigem = scanner.nextLine();
        System.out.println("Agora, insira o CEP de destino do envio");
        cepDestino = scanner.nextLine();
        System.out.println("Quanto pesa a sua encomenda?");
        peso = scanner.nextLine();
        System.out.println("Qual o formato? (informe 1 para caixa/pacote, 2 para rolo ou prisma e 3 para envelope");
        formato = scanner.nextLine();
        System.out.println("Qual o comprimento?");
        comprimento = scanner.nextLine();
        System.out.println("Qual a altura?");
        altura = scanner.nextLine();
        System.out.println("E a largura?");
        largura = scanner.nextLine();
        System.out.println("Pode me dizer o diâmetro agora?");
        diametro = scanner.nextLine();
        System.out.println("Quanto custa o que está sendo enviado?");
        valorDeclarado = scanner.nextLine();
    }

    private String parametrosEnvio() {
        StringBuffer parametros = new StringBuffer();

        parametros.append("https://cws.correios.com.br/calculador/CalcPrecoPrazo.asmx/CalcPrecoPrazo")
                .append("?nCdServico=41106")
                .append("&sCepOrigem=").append(cepOrigem)
                .append("&sCepDestino=").append(cepDestino)
                .append("&nVlPeso=").append(peso)
                .append("&nCdFormato=").append(formato)
                .append("&nVlComprimento=").append(comprimento)
                .append("&nVlAltura=").append(altura)
                .append("&nVlLargura=").append(largura)
                .append("&nVlDiametro=").append(diametro)
                .append("&sCdMaoPropria=N")
                .append("&nVlValorDeclarado=").append(valorDeclarado)
                .append("&sCdAvisoRecebimento=N");

        return parametros.toString();
    }
}

