package web.dao;


import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.tags.ArgumentAware;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {
    private List<Car> cars=new ArrayList<>();

    public  List<Car> getAllCars(){
        return cars;

   }
   public List<Car> getCarList(int  count){
        List<Car> allCars=getAllCars();
        return allCars.stream().limit(count).toList();
}
}
