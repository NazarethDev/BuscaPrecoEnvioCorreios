package br.com.nazareth.ConsumoApiCorreios;

import br.com.nazareth.ConsumoApiCorreios.consumo.ConsumoApi;
import br.com.nazareth.ConsumoApiCorreios.consumo.ConverteDados;
import br.com.nazareth.ConsumoApiCorreios.obterDadosCliente.ConsultaWeb;
import br.com.nazareth.ConsumoApiCorreios.obterDadosCliente.DadosDoEnvio;
import br.com.nazareth.ConsumoApiCorreios.obterDadosCliente.GeraUrlCorreios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiCorreiosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiCorreiosApplication.class, args);
	}

		@Autowired
		ConsultaWeb consultaWeb;

	@Override
	public void run(String... args) throws Exception {

		consultaWeb.pesquisa();
	}
}
