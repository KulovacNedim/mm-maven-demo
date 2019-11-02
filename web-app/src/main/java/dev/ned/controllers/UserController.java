package dev.ned.controllers;

import dev.ned.converters.UserMapper;
import dev.ned.domain.UserCommand;
import dev.ned.entities.User;

public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
