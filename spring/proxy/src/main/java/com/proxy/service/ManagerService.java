package com.proxy.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Cacheable
public class ManagerService {

    public String getManagerName() {
        return "Manager";
    }
}
