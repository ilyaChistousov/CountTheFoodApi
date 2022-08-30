package ilya.chistousov.countthefoodapi.controller;

import ilya.chistousov.countthefoodapi.entity.Food;
import ilya.chistousov.countthefoodapi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/{name}")
    public List<Food> findFoodByName(@PathVariable String name) {
        return foodService.findFoodByName(name);
    }
}
