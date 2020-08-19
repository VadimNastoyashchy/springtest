package com.myapp.springtest.controller;

import com.myapp.springtest.model.Car;
import com.myapp.springtest.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */
@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String findAll(Model model){
        List<Car> carsList = carService.findAll();
        model.addAttribute("cars", carsList);
        return "car-list";
    }

    @GetMapping("/car-create")
    public String createCarForm(Car car){

        return "/car-create";
    }

    @PostMapping("/car-create")
    public String crateCar(Car car){
        carService.saveCar(car);
        return "redirect:/cars";
    }
    @GetMapping("car-delete/{id}")
    public String deleteCar(@PathVariable("id") Long id){
        carService.deleteById(id);
        return "redirect:/cars";
    }

    @GetMapping("/car-update/{id}")
    public String updateCarForm(@PathVariable("id") Long id, Model model){
        Car car = carService.findById(id);
        model.addAttribute("car", car);
        return "car-update";
    }

    @PostMapping("/car-update")
    public String updateCar(Car car){
        carService.saveCar(car);
        return "redirect:/cars";
    }
}

