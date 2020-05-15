package it.mariani.titti.be.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"it.mariani.titti.be.controller"})
public class TittiApplication extends SpringBootServletInitializer {

  public static void run(String[] args) {
    SpringApplication.run(TittiApplication.class, args);
  }
}
