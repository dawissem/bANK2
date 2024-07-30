package com.dawissem.bank2.Service;


import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public int loginValidation(Integer matricule, String password);

 }
