package it.mariani.titti.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"it.mariani.titti.controller"})
public class TittiApplication extends SpringBootServletInitializer {

  public static void run(String[] args) {
    SpringApplication.run(TittiApplication.class, args);
  }
}
