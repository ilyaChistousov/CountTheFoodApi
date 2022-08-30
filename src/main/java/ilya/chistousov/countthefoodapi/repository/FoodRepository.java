package ilya.chistousov.countthefoodapi.repository;

import ilya.chistousov.countthefoodapi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findAllByNameContainingIgnoreCase(String name);
}
