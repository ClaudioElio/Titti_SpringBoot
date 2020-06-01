package it.mariani.titti.fe.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.mariani.titti.core.model.Greeting;

@FeignClient(name="titti-BE")
public interface TittiBEProxy {

	@RequestMapping(method = RequestMethod.GET, value = "/ctrl-3/hello-3")
	Greeting getGreeting(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name,
            @RequestParam(value = "number", required = false, defaultValue = "-1") String num);

}
