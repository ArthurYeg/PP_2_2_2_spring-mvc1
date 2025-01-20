package web.serivice;

import web.model.Car;
import java.util.List;


public interface CarService {
  List<Car> getCarList(int count);

}