package it.mariani.titti.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"it.mariani.titti.controller"})
public class TittiApplication {

  public static void run(String[] args) {
    SpringApplication.run(TittiApplication.class, args);
  }
}
