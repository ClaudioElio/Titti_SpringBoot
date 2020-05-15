package it.mariani.claudio.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceregistryApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(EurekaServiceregistryApplication.class).web(true).run(args);
		SpringApplication.run(EurekaServiceregistryApplication.class, args);
	}
}
