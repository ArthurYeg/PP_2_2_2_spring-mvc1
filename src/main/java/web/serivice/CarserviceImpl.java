package web.serivice;
import org.springframework.stereotype.Repository;
import web.dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

@Repository
public class CarserviceImpl implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarserviceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarList(List<Car> list, int number) {
        return List.of();
    }


    @Override
    public List<Car> getCarList(int count) {
        return List.of();
    }
}
