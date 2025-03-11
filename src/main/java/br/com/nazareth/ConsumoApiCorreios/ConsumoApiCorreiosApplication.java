package br.com.nazareth.ConsumoApiCorreios;

import br.com.nazareth.ConsumoApiCorreios.obterDadosCliente.ConsultaWeb;
import br.com.nazareth.ConsumoApiCorreios.obterDadosCliente.DadosDoEnvio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiCorreiosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiCorreiosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsultaWeb novaConsulta = new ConsultaWeb();

		novaConsulta.pesquisa();
	}
}
