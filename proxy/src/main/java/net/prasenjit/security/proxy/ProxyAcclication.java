package net.prasenjit.security.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.sso.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class ProxyAcclication {
    public static void main(String[] args) {
        SpringApplication.run(ProxyAcclication.class, args);
    }
}
