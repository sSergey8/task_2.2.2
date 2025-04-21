package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.CarService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carsList(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        count = (count <= 0) ? 5 : count;
        model.addAttribute("list", carService.getCars(count));
        return "cars";
    }

}
