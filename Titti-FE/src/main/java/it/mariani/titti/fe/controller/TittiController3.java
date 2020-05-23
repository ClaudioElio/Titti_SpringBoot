package it.mariani.titti.fe.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import it.mariani.titti.core.model.Greeting;
import it.mariani.titti.core.utility.logger.Logger;
import it.mariani.titti.core.utility.logger.LoggerFactory;
import it.mariani.titti.fe.proxy.GreetingProxy;

@RestController
@RequestMapping("/ctrl-3")
public class TittiController3 {

    private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	GreetingProxy greetingProxy;
	
    @RequestMapping(value = "/hello-3")
    public @ResponseBody Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name,
                                           @RequestParam(value = "number", required = false, defaultValue = "-1") String num) {

    	Greeting greeting = greetingProxy.getGreeting(name, num);
    	logger.info("greeting.toString()=" + greeting.toString());
    	return greeting;

    }

}
