package mx.com.tde.metrorrey.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MetrorreyBackendImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetrorreyBackendImplementationApplication.class, args);
	}

}
