package web.dao;


import org.springframework.stereotype.Repository;

import web.model.Car;
import java.util.List;

@Repository
public interface CarDAO {
    List<Car> getAllCars();

}