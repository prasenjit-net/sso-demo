package net.prasenjit.security.proxy;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String test() {
        return "success for user "
                + SecurityContextHolder.getContext().getAuthentication()
                .getName();
    }
}
