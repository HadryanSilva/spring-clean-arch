package br.com.hadryan.clean.infra.gateway;

import br.com.hadryan.clean.application.gateway.UserGateway;
import br.com.hadryan.clean.domain.entity.User;
import br.com.hadryan.clean.infra.persistence.UserModel;
import br.com.hadryan.clean.infra.persistence.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserModelMapper userModelMapper;

    @Override
    public User createUser(User user) {
        UserModel userModel = userModelMapper.toModel(user);
        var savedUser =  userRepository.save(userModel);
        return userModelMapper.toDomain(savedUser);
    }

}
