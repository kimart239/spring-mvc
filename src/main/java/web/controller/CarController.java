package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @Autowired
    private CarDaoImp carDaoImp;

    @GetMapping("/cars")
    public String getCar(@RequestParam (value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("ms", carDaoImp.getCarByCount(count));
        return "cars";
    }
}
