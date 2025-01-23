package br.com.hadryan.clean.application.gateway;

import br.com.hadryan.clean.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserGateway {

    User createUser(User user);

}
