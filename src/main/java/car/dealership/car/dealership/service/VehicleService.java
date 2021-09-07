package car.dealership.car.dealership.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import car.dealership.car.dealership.entity.Vehicle;
import car.dealership.car.dealership.repository.VehicleRepository;


public interface VehicleService {
	
	List<Vehicle> getAllVehicles();
	
	Vehicle saveVehicle(Vehicle vehicle);
	
	@Query("SELECT V FROM Vehicle V WHERE V.vin = ?1")
	Vehicle getVehicleById(String vin);
	
	Vehicle editVehicle(Vehicle vehicle);
	
	@Query("SELECT V.manufacturer, V.build, V.year, V.color, V.price, V.description, V.mileage, V.invDate, V.vin FROM Vehicle V WHERE V.Used='Used'")
	List<Vehicle> getUsedVehicles();
	
	
	

	
}
