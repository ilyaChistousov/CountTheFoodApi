package ilya.chistousov.countthefoodapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "profile_food")
public class ProfileFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food_name")
    private String name;

    private Integer calories;

    private Float fat;

    private Float protein;

    private Float carbs;

    private Integer grams;

    private LocalDate addedDate;

    @Enumerated
    private Meal meal;
}

enum Meal {
    BREAKFAST, LUNCH, DINNER, SNACK
}
