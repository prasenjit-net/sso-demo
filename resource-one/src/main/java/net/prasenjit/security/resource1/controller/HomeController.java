package net.prasenjit.security.resource1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by PRASENJIT on 8/12/2015.
 */
@RestController
public class HomeController {

    @RequestMapping("/greet")
    public String home() {
        return "text from resource server";
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
