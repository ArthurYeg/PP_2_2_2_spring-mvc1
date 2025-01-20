package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;
import web.serivice.CarService;

import java.util.List;


@Controller
public class CarsController {
    private final CarService carService;

   @Autowired
    public CarsController(CarService carService){
       this.carService=carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
