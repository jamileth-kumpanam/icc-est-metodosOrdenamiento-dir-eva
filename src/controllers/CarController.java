package controllers;

import models.Car;

public class CarController {

  public void sortByCar(Car[] cars) {
    for (int i = 0; i < cars.length; i++) {
      int minIndex = i;
      for (int j = 0; j < cars.length; j++) {
        if (cars[j].getName().compareToIgnoreCase(cars[minIndex].getName()) < 0) {
          minIndex = j;
        }

        if (minIndex != i) {
          Car temp = cars[i];
          cars[i] = cars[minIndex];
          cars[minIndex] = temp;
        }
      }
    }
  }

  public void sortByName(Car[] paraOrdenar) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sortByName'");
  }
}
