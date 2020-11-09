package com.learning;

import com.learning.service.CarService;
import com.learning.service.CarServiceImpl;

public class App {

  public static void main(String[] args) {
    CarService carService=new CarServiceImpl();
    System.out.println(carService.getCars().get(0).getName());
  }
}
