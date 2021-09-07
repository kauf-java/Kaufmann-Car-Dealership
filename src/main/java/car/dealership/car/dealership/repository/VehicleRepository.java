package car.dealership.car.dealership.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import car.dealership.car.dealership.entity.Vehicle;

//JPARepository has two parameters; entity and primary key
//@Repository; don't need this annotation since we have JPA repository which implements a default
// Don't need to add @Transactional either becasue JPA has default @Transactional
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String>{
	
	@Query("SELECT V.make, V.build, V.year, V.color, V.price, V.description, V.mileage, V.invDate, V.vin FROM Vehicle V WHERE V.used=?1")
	Vehicle getNewVehicles(String newCars);
	
}
