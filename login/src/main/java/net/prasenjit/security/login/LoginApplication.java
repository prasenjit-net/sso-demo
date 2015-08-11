package net.prasenjit.security.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class LoginApplication implements ServletContextInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
        servletContext.getSessionCookieConfig().setName("SESSIONID");
    }
}
