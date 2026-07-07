package br.com.api.salaohub.boot.config;

import br.com.api.salaohub.application.service.RegisterClientGateway;
import br.com.api.salaohub.application.RegisterCustomer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterCustomerConfig {

    @Bean
    public RegisterCustomer  registerCustomer(RegisterClientGateway registerClientGateway) {
        return new RegisterCustomer(registerClientGateway);
    }

}
