package br.com.nazareth.ConsumoApiCorreios.obterDadosCliente;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DadosDoEnvio {
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

    public String getPeso() {
        return peso;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public String getFormato() {
        return formato;
    }

    public String getComprimento() {
        return comprimento;
    }

    public String getAltura() {
        return altura;
    }

    public String getLargura() {
        return largura;
    }

    public String getDiametro() {
        return diametro;
    }

    public String getValorDeclarado() {
        return valorDeclarado;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public void setValorDeclarado(String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void obterDadosUsuario(){
        System.out.println("Por favor, responda todas as perguntas com números naturais! (inteiros e > 0");
        System.out.println("Informe o CEP de destino do envio: ");
        setCepDestino(scanner.nextLine());
        System.out.println("Agora, insira o CEP de destino do envio");
        setCepOrigem(scanner.nextLine());
        System.out.println("Quanto pesa a sua encomenda?");
        setPeso(scanner.nextLine());
        System.out.println("Qual o formato? (informe 1 para caixa/pacote, 2 para rolo ou prisma e 3 para envelope");
        setFormato(scanner.nextLine());
        System.out.println("Qual o comprimento?");
        setComprimento(scanner.nextLine());
        System.out.println("Qual a altura?");
        setAltura(scanner.nextLine());
        System.out.println("E a largura?");
        setLargura(scanner.nextLine());
        System.out.println("Pode me dizer o diâmetro agora?");
        setDiametro(scanner.nextLine());
        System.out.println("Quanto custa o que está sendo enviado?");
        setValorDeclarado(scanner.nextLine());
    }

}

