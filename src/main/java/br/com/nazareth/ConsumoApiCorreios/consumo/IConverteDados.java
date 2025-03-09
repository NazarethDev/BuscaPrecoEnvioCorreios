package br.com.nazareth.ConsumoApiCorreios.consumo;


public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}