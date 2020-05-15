package it.mariani.titti.fe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.mariani.titti.core.model.Greeting;
import it.mariani.titti.core.utility.logger.Logger;
import it.mariani.titti.core.utility.logger.LoggerFactory;

@RestController
@RequestMapping("/ctrl-3")
public class TittiController3 {

    private final Logger logger = LoggerFactory.getLogger(getClass());

	private static final RestTemplate restTemplate = new RestTemplateBuilder().build();

	@Value("${TITTIBE_HOST}")
	private String hello3Host;
	
    @RequestMapping(value = "/hello-3")
    public @ResponseBody Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name,
                                           @RequestParam(value = "number", required = false, defaultValue = "-1") String num) {

    	logger.info(hello3Host);

    	Greeting greeting = restTemplate.getForObject(hello3Host + "/ctrl-3/hello-3", Greeting.class);
		logger.info(greeting.toString());
    	return greeting;

    }

}
