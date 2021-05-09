package com.oak.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oak.dto.Options;

@Repository
public interface OptionRepository extends CrudRepository<Options, Integer> {


}
