package br.com.api.cadastro_barbeiro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"br.com.api.cadastro_barbeiro"})
@EntityScan(basePackages = {"br.com.api.cadastro_barbeiro.adapter.out.entity"})
@EnableJpaRepositories(basePackages = {"br.com.api.cadastro_barbeiro.adapter.out.repository"})
@EnableJpaAuditing
@SpringBootApplication
public class CadastroBarbeiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroBarbeiroApplication.class, args);
	}

}
