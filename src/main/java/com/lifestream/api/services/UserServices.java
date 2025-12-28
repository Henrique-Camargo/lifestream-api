package com.lifestream.api.services;

import com.lifestream.api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private final UserRepository usersRepository;

    public UserServices(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

}
