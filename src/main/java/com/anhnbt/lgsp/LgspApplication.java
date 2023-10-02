package com.anhnbt.lgsp;

import com.anhnbt.lgsp.model.UserInfo;
import com.anhnbt.lgsp.repository.UserInfoRepository;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String apiVersion) {
        final String securitySchemeName = "bearerAuth";
        final String apiTitle = String.format("%s API", StringUtils.capitalize("Dịch vụ tích hợp với CSDLQG về Khiếu Nại Tố Cáo"));
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info().title(apiTitle).version(apiVersion)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

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
