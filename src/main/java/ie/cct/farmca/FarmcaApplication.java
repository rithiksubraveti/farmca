package ie.cct.farmca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct.farmca") // to scan everything from the package
public class FarmcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmcaApplication.class, args);
	}

}
