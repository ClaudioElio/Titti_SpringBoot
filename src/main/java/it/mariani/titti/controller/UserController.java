package it.mariani.titti.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }

}
