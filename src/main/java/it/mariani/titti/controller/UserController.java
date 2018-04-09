package it.mariani.titti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctrl-user")
public class UserController {

    public TittiController2() {

    }

    @RequestMapping("/me")
    public Principal user(Principal principal) {
        return principal;
    }

}
