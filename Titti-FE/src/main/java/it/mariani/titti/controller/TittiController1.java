package it.mariani.titti.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@EnableOAuth2Sso
@Controller
@RequestMapping("/ctrl-1")
public class TittiController1 {

    public TittiController1() {

    }

    @RequestMapping("/hello-1")
    public ModelAndView hello() {
        return new ModelAndView("layout-1");
    }

}
