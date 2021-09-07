package car.dealership.car.dealership.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import car.dealership.car.dealership.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
