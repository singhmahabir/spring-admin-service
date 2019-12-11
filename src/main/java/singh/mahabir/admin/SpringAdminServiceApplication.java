package singh.mahabir.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * Implements main entry point for the Spring Boot Admin Service
 * 
 * @author Mahabir Singh
 *
 */
@SpringBootApplication
// Below annotation is required to start the spring admin service
@EnableAdminServer
//@EnableDiscoveryClient
public class SpringAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminServiceApplication.class, args);
	}

}
