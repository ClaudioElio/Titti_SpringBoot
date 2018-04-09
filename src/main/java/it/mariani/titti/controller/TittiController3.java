package it.mariani.titti.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/ctrl-3")
public class TittiController3 {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/hello-3")
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name, @RequestParam(value="number", required=false, defaultValue="-1") String num) {
	    long greetingNum = num.equals("-1") ? counter.incrementAndGet(): Long.parseLong(num, 10); 
        return new Greeting(greetingNum, String.format(template, name));
    }

}
