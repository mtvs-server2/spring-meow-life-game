package com.catholic.meowlife.application.controller;
import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterController {

    @Autowired
    RegisterService registerService;

    public boolean gotoRegisterService(PlayerDTO playerDTO){
        boolean registerResult = registerService.signIn(playerDTO);

        return registerResult;
    }
}
