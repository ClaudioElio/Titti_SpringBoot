package it.mariani.titti.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"it.mariani.titti.controller"})
public class TittiMain {

	public static void main(String[] args) {
		SpringApplication.run(TittiMain.class, args);
	}

}