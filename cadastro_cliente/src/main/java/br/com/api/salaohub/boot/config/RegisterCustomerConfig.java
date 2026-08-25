package br.com.api.salaohub.boot.config;

import br.com.api.salaohub.application.DeleteCustomer;
import br.com.api.salaohub.application.UpdateCustomer;
import br.com.api.salaohub.application.service.RegisterClientService;
import br.com.api.salaohub.application.RegisterCustomer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterCustomerConfig {

    @Bean
    public RegisterCustomer  registerCustomer(RegisterClientService registerClientService) {
        return new RegisterCustomer(registerClientService);
    }

    @Bean
    public UpdateCustomer updateCustomer(RegisterClientService registerClientService) {
        return new UpdateCustomer(registerClientService);
    }

    @Bean
    public DeleteCustomer deleteCustomer(RegisterClientService registerClientService) {
        return new DeleteCustomer(registerClientService);
    }
}
