package com.myapp.springtest.service;

import com.myapp.springtest.model.Car;
import com.myapp.springtest.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car findById(Long id) {
        return carRepository.getOne(id);
    }

    public List<Car> findAll() {
        return carRepository.findAll();

    }

    public Car saveCar(Car car) {
        return carRepository.save(car);

    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);

    }
}

