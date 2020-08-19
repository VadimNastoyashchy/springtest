package com.myapp.springtest.repository;

import com.myapp.springtest.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vadym Nastoiashchyi
 */

public interface CarRepository extends JpaRepository<Car, Long> {
}
