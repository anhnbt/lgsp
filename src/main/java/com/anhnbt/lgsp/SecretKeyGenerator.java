package com.anhnbt.lgsp;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;

public class SecretKeyGenerator {

    public static void main(String[] args) throws Exception {
        // Sử dụng SecureRandom để tạo seed ngẫu nhiên
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = secureRandom.generateSeed(32); // 32 bytes cho một secret key 256 bits

        // Tạo đối tượng KeyGenerator với thuật toán HmacSHA256
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");

        // Sử dụng seed để khởi tạo KeyGenerator
        secureRandom.setSeed(seed);
        keyGenerator.init(secureRandom);

        // Tạo secret key
        SecretKey secretKey = keyGenerator.generateKey();

        // In ra secret key (dưới dạng Base64 hoặc hex, tùy ý)
        byte[] keyBytes = secretKey.getEncoded();
        String base64Key = java.util.Base64.getEncoder().encodeToString(keyBytes);
        System.out.println("Secret Key (Base64): " + base64Key);
    }
}
