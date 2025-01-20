package web.serivice;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.stream.Collectors;
import java.util.List;

@Service
public class CarserviceImpl implements CarService {
    @Autowired
    private  CarDAO carDAO;

//    @Autowired
//    public CarserviceImpl(CarDAO carDAO) {
//        this.carDAO = carDAO;
//    }

    @Override
    public List<Car> getCars(int count) {
         return carDAO.getCars(count);

    }
}