package taller.systems.com.example.springbootbias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootBiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBiasApplication.class, args);
	}

}
