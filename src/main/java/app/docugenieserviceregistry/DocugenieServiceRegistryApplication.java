package app.docugenieserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DocugenieServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocugenieServiceRegistryApplication.class, args);
	}

}
