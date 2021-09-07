package car.dealership.car.dealership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import car.dealership.car.dealership.entity.User;
import car.dealership.car.dealership.entity.Vehicle;
import car.dealership.car.dealership.repository.UserRepository;
import car.dealership.car.dealership.repository.VehicleRepository;
import car.dealership.car.dealership.service.UserService;
import car.dealership.car.dealership.service.VehicleService;

@Controller
public class VehicleController {
	
	private VehicleService vehicleService;
	
	private UserService userService;
	
	public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String welcomePage(Model model) {
		return "index";
	}
	
	@GetMapping("/used")
	public String usedVehicles(Model model) {
		model.addAttribute("used", vehicleService.getUsedVehicles());
		return "used";
	}

	
	@GetMapping("/newCar")
	public String getNewVehicle(Model model) {
		String newCars = "new";
		model.addAttribute("newCar", vehicleRepository.getNewVehicles(newCars));
		return "newCar";
		}
	
	//handler method to handle list students and return mode and view
	// Model is imported from Spring
	@GetMapping("/vehicles")
	public String listVehicles(Model model) {
		model.addAttribute("vehicles", vehicleService.getAllVehicles());
		return "vehicles";
	}
	
	@GetMapping("/vehicles/new")
	public String createVehicleForm(Model model) {
		//create vehicle object to hold vehicle form data
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle", vehicle);
		return "create_vehicle";
	}
	
	@PostMapping("/vehicles")
	public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "redirect:/vehicles";
	}
	
	@GetMapping("/vehicles/edit/{vin}")
	public String editVehicleForm(@PathVariable String vin, Model model) {
		model.addAttribute("vehicle", vehicleService.getVehicleById(vin));
		return "edit_vehicle";
	}
	
	@PostMapping("/vehicles/{vin}")
	public String editVehicle(@PathVariable String vin,
			@ModelAttribute("vehicle") Vehicle vehicle, Model model) {
		
		//get vehicle from db by models
		Vehicle existingVehicle = vehicleService.getVehicleById(vin);
		existingVehicle.setMake(vehicle.getMake());
		existingVehicle.setBuild(vehicle.getBuild());
		existingVehicle.setYear(vehicle.getYear());
		existingVehicle.setColor(vehicle.getColor());
		existingVehicle.setPrice(vehicle.getPrice());
		existingVehicle.setDescription(vehicle.getDescription());
		existingVehicle.setMileage(vehicle.getMileage());
		existingVehicle.setUsed(vehicle.getUsed());
		existingVehicle.setSold(vehicle.getSold());
		existingVehicle.setInvDate(vehicle.getInvDate());
		existingVehicle.setBuyerId(vehicle.getBuyerId());
		existingVehicle.setVin(vehicle.getVin());
		
		vehicleService.editVehicle(existingVehicle);
		return "redirect:/vehicles";
	}
	
	@GetMapping("/signUp")
	public String signUpForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signUp";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user, Model model) {
		userRepository.save(user);
		return "saveUser";
	}

}
