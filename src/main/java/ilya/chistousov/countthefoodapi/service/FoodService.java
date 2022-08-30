package ilya.chistousov.countthefoodapi.service;

import ilya.chistousov.countthefoodapi.entity.Food;
import ilya.chistousov.countthefoodapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> findFoodByName(String name) {
        return foodRepository.findAllByNameContainingIgnoreCase(name);
    }
}
