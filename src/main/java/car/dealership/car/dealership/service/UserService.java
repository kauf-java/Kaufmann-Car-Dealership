package car.dealership.car.dealership.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car.dealership.car.dealership.entity.User;
import car.dealership.car.dealership.entity.Vehicle;
import car.dealership.car.dealership.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}


}
