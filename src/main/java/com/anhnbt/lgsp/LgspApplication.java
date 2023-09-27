package com.anhnbt.lgsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LgspApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LgspApplication.class, args);
	}



	@Autowired
	UserInfoRepository userInfoRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		// Khi chương trình chạy
		// Insert vào csdl một user.
		UserInfo user = new UserInfo();
		user.setUsername("user123");
		user.setName("anhnbt");
		user.setPassword(passwordEncoder.encode("mr.robot"));
		user.setRoles("ROLE_ADMIN");
		userInfoRepository.save(user);
		System.out.println(user);
	}

}
