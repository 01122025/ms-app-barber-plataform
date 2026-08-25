package br.com.ms.login.screm.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"br.com.ms.login.screm"})
@EntityScan(basePackages = {"br.com.ms.login.screm.adapter.out.entity"})
@EnableJpaRepositories(basePackages = {"br.com.ms.login.screm.adapter.out.repository"})
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = "br.com.ms.login.screm")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
