package it.mariani.titti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctrl-2")
public class TittiController2 {

    public TittiController2() {

    }

    @RequestMapping("/hello-2")
    public ModelAndView hello() {
        return new ModelAndView("layout-2");
    }

}
