package it.mariani.titti.fe.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"it.mariani.titti.fe.proxy"})
@EnableCircuitBreaker
@SpringBootApplication(scanBasePackages = {"it.mariani.titti.fe.controller"})
public class TittiApplication extends SpringBootServletInitializer {

  public static void run(String[] args) {
    SpringApplication.run(TittiApplication.class, args);
  }
}
