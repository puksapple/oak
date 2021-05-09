package com.oak.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oak.dto.Users;
@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {

	Optional<Users> findByName(String name);
	
}
