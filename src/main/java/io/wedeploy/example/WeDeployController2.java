package io.wedeploy.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello-2")
public class WeDeployController2 {

    public WeDeployController2() {

    }

    @RequestMapping("/hello-2")
    public ModelAndView hello() {
        return new ModelAndView("layout");
    }

}
