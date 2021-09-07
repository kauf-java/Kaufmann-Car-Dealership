package car.dealership.car.dealership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import car.dealership.car.dealership.repository.VehicleRepository;

@SpringBootApplication
@ComponentScan(basePackages = "car.dealership")
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
}
