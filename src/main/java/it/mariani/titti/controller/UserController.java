package it.mariani.titti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Controller
@RequestMapping("/ctrl-user")
public class UserController {

    public UserController() {

    }

    @RequestMapping(value="/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }

}
