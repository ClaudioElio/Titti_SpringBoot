package it.mariani.titti.fe.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.mariani.titti.core.model.Greeting;

@FeignClient("titti-BE")
public interface GreetingProxy {

	@RequestMapping(method = RequestMethod.GET, value = "/ctrl-3/hello-3")
	Greeting getGreeting();

}
