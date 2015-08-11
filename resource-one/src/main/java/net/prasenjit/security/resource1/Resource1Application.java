package net.prasenjit.security.resource1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;

@SpringBootApplication
@EnableOAuth2Resource
public class Resource1Application {

    public static void main(String[] args) {
        SpringApplication.run(Resource1Application.class, args);
    }
}
