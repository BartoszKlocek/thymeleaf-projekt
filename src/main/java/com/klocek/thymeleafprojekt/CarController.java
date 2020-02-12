package com.klocek.thymeleafprojekt;

import com.klocek.thymeleafprojekt.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String get(Model model){

        Car car = new Car("Kia","Sportage");

        model.addAttribute("name","Bartek");
        model.addAttribute("car",car);
        return "car";
    }
}
