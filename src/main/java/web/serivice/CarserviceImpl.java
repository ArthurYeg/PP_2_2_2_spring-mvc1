package web.serivice;
import web.dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.List;

@Component
public class CarserviceImpl implements CarService {
    private CarDAO cardao;
    @Autowired
    public CarserviceImpl(CarDAO cardao) {
        this.cardao = cardao;
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
