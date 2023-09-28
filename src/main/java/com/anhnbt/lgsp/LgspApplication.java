package com.anhnbt.lgsp;

import com.anhnbt.lgsp.model.UserInfo;
import com.anhnbt.lgsp.repository.UserInfoRepository;
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
		user.setName("Nguyễn Bá Tuấn Anh");
		user.setPassword(passwordEncoder.encode("mr.robot"));
		user.setRoles("ROLE_ADMIN");
		userInfoRepository.save(user);
		// In ra username và password
		System.out.println("Username: " + "user123");
		System.out.println("Password: " + "mr.robot");
	}

}
