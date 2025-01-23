package br.com.hadryan.clean.infra.gateway;

import br.com.hadryan.clean.domain.entity.User;
import br.com.hadryan.clean.infra.persistence.UserModel;

public class UserModelMapper {

    UserModel toModel(User user) {
        return new UserModel(user);
    }

    User toDomain(UserModel userModel) {
        return new User(userModel.getUsername(), userModel.getPassword(), userModel.getEmail());
    }

}
