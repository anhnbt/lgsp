package com.anhnbt.lgsp.controller;

import com.anhnbt.lgsp.request.AuthRequest;
import com.anhnbt.lgsp.response.ApiResponse;
import com.anhnbt.lgsp.response.JsonResponse;
import com.anhnbt.lgsp.response.AuthResponse;
import com.anhnbt.lgsp.service.CustomUserDetailsService;
import com.anhnbt.lgsp.service.JwtTokenUtil;
import com.anhnbt.lgsp.model.UserInfo;
import com.anhnbt.lgsp.service.UserInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailsService customUserDetailsService;
    private final UserInfoService userInfoService;
    private final JwtTokenUtil jwtTokenUtil;

    public AuthController(
            AuthenticationManager authenticationManager,
            JwtTokenUtil jwtTokenUtil,
            CustomUserDetailsService customUserDetailsService, UserInfoService userInfoService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
        this.customUserDetailsService = customUserDetailsService;
        this.userInfoService = userInfoService;
    }

    @PostMapping("/generateToken")
    public ResponseEntity<?> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        // Xác thực thông tin đăng nhập
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        // Nếu xác thực thành công, tạo token
        final UserDetails userDetails = customUserDetailsService.loadUserByUsername(authRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails.getUsername());

        // Trả về token trong response
        return ResponseEntity.ok(new AuthResponse(token));
    }

    @GetMapping("/welcome")
    public ResponseEntity<?> welcome() {
        return ResponseEntity.ok(new ApiResponse(userInfoService.findAll()));
    }

    @PostMapping("/addNewUser")
    public JsonResponse addNewUser(@RequestBody UserInfo userInfo) {
        return new JsonResponse(userInfoService.addUser(userInfo));
    }

    @GetMapping("/user/userProfile")
    public String userProfile() {
        return "Welcome to User Profile";
    }

    @GetMapping("/admin/adminProfile")
    public String adminProfile() {
        return "Welcome to Admin Profile";
    }

}