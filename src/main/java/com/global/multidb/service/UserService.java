package com.global.multidb.service;

import com.global.multidb.model.User;
import com.global.multidb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void insert(User user) {
        userRepository.save(user);
    }
}
