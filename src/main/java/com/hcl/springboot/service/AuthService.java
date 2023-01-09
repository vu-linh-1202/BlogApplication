package com.hcl.springboot.service;

import com.hcl.springboot.payload.LoginDto;
import com.hcl.springboot.payload.RegisterDto;

import javax.swing.*;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
