package com.firstapi.model;

import org.springframework.stereotype.Service;

@Service
public class ImpFirstService implements IFirstService{

    @Override
    public String GetStringService() {
        return "Hello World desde el  servicio";
    }
}
