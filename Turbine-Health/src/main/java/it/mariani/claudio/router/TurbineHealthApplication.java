package it.mariani.claudio.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
public class TurbineHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineHealthApplication.class, args);
	}
}
