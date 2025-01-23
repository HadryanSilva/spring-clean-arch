package br.com.hadryan.clean.main;

import br.com.hadryan.clean.application.gateway.UserGateway;
import br.com.hadryan.clean.application.usecase.CreateUserInteractor;
import br.com.hadryan.clean.infra.controller.UserDTOMapper;
import br.com.hadryan.clean.infra.gateway.UserModelMapper;
import br.com.hadryan.clean.infra.gateway.UserRepositoryGateway;
import br.com.hadryan.clean.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserModelMapper userModelMapper) {
        return new UserRepositoryGateway(userRepository, userModelMapper);
    }

    @Bean
    UserModelMapper userModelMapper() {
        return new UserModelMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }

}
