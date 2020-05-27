package it.mariani.claudio.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulRouterBalancerApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(EurekaServiceregistryApplication.class).web(true).run(args);
		SpringApplication.run(ZuulRouterBalancerApplication.class, args);
	}
}
