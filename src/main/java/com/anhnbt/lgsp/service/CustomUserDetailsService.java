package com.anhnbt.lgsp.service;

import com.anhnbt.lgsp.model.UserInfo;
import com.anhnbt.lgsp.model.UserInfoDetails;
import com.anhnbt.lgsp.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public CustomUserDetailsService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<UserInfo> userDetail = userInfoRepository.findByUsername(username);

        // Converting userDetail to UserDetails
        return userDetail.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }
}