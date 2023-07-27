package com.playlist.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PlayApplication {
     //http://localhost:8080
	public static void main(String[] args) {
		SpringApplication.run(PlayApplication.class, args);
	}

}
