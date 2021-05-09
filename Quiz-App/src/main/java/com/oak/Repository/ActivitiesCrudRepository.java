package com.oak.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.oak.dto.Activities;
@Repository
public interface ActivitiesCrudRepository extends CrudRepository<Activities, Integer> {

}
