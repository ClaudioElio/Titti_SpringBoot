package it.mariani.titti.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages={"it.mariani.titti.controller"})
public class TittiMain {

	public static void main(String[] args) {
		SpringApplication.run(TittiMain.class, args);
	}

}
