package it.mariani.titti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.security.Principal;

@Controller
@RequestMapping("/ctrl-user")
public class UserController {

    public UserController() {

    }

    @RequestMapping(value="/me")
    public Principal user(Principal principal) {
        return principal;
    }

}
