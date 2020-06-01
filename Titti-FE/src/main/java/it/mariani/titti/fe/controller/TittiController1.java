package it.mariani.titti.fe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctrl-1")
public class TittiController1 {

    @RequestMapping("/hello-1")
    public ModelAndView hello() {
        return new ModelAndView("layout-1");
    }

}
