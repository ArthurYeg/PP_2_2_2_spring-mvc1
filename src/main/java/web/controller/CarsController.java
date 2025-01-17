package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.serivice.CarService;

import java.util.List;


@Controller
public class CarsController {
    @Autowired
    private CarService carservice;

    @GetMapping("/cars")
    public String Getcars(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        List<Car> cars=carservice.getCars(count);
        model.addAttribute("cars",cars);
        return "cars";
    }
}
