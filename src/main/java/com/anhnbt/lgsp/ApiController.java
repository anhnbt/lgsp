package com.anhnbt.lgsp;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @GetMapping("/generateToken")
    public ApiResponse generateToken() {
        Key key = getSigningKey(jwtSecret);
        // Thời gian hết hạn của JWT (ví dụ: 1 giờ)
        long expirationMillis = System.currentTimeMillis() + 3600000; // 1 giờ
        Date now = new Date();
        // Tạo JWT
        String jws = Jwts.builder()
                .setSubject("user123")
                .claim("name", "Anh Nguyễn Bá Tuấn")
                .setIssuedAt(now)
                .setExpiration(new Date(expirationMillis))
                .signWith(key
                )
                .compact();

        return new ApiResponse(jws);
    }

    private static Key getSigningKey(String secret) {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    @GetMapping("/hello")
    public ApiResponse hello() {
        return new ApiResponse("Hello, World!");
    }
}
