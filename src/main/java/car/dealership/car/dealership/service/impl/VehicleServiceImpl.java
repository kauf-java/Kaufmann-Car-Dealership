package car.dealership.car.dealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car.dealership.car.dealership.entity.Vehicle;
import car.dealership.car.dealership.repository.VehicleRepository;
import car.dealership.car.dealership.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public List<Vehicle> getAllVehicles() {
		
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle getVehicleById(String vin) {
		
		return vehicleRepository.findById(vin).get();
	}

	@Override
	public Vehicle editVehicle(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public List<Vehicle> getUsedVehicles() {
		
		return vehicleRepository.findAll();
	}
	
//	public List<Vehicle> getNewVehicles() {
//		return vehicleRepository.getNewVehicles();
//	}

}
