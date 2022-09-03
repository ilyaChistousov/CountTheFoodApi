package ilya.chistousov.countthefoodapi.entity;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "profile")
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gender;

    private String goal;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "activity_level")
    private String activityLevel;

    @Column(name = "current_growth")
    private Integer currentGrowth;

    @Column(name = "current_weight")
    private Float currentWeight;

    @Column(name = "desired_weight")
    private Float desiredWeight;

    @Column(unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProfileFood> foods = new ArrayList<>();

    public void addFood(ProfileFood food) {
        foods.add(food);
    }

}

