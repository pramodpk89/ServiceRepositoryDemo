package com.learning.service;

import com.learning.model.Car;
import com.learning.repository.CarRepository;
import com.learning.repository.CarRepositoryImpl;
import java.util.List;

public class CarServiceImpl implements CarService {

  public List<Car> getCars() {
    CarRepository carRepository = new CarRepositoryImpl();
    return carRepository.findAllCars();
  }
}
