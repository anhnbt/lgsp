package com.anhnbt.lgsp.service;

import com.anhnbt.lgsp.model.UserInfo;
import com.anhnbt.lgsp.repository.UserInfoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    private final PasswordEncoder encoder;

    public UserInfoService(UserInfoRepository userInfoRepository, PasswordEncoder encoder) {
        this.userInfoRepository = userInfoRepository;
        this.encoder = encoder;
    }

    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(encoder.encode(userInfo.getPassword())); // Mã hóa mật khẩu
        userInfoRepository.save(userInfo);
        return "User Added Successfully";
    }

    public Optional<UserInfo> findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }

    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }
}