package com.greenfox.est.Repositories;

import com.greenfox.est.Models.DTOs.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log, Integer> {
  List<Log> findAll();
}
