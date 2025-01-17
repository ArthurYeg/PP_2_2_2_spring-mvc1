package web.serivice;


import web.model.Car;

import java.util.List;

public interface CarService {
 List<Car> carsCount(List<Car> list, int number);

List<Car> getCars(int i);
}