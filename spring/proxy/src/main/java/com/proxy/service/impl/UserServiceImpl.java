package com.proxy.service.impl;


import com.proxy.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Cacheable
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String findUsername() {
        return "Test Name";
    }
}
