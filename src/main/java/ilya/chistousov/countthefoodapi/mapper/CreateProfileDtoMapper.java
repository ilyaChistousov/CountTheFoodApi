package ilya.chistousov.countthefoodapi.mapper;

import ilya.chistousov.countthefoodapi.dto.CreateProfileDto;
import ilya.chistousov.countthefoodapi.entity.Profile;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class CreateProfileDtoMapper {

    public Profile mapToProfile(CreateProfileDto dto) {
        return Profile.builder()
                .gender(dto.getGender())
                .goal(dto.getGoal())
                .birthDate(dto.getBirthDate())
                .activityLevel(dto.getActivityLevel())
                .currentGrowth(dto.getCurrentGrowth())
                .currentWeight(dto.getCurrentWeight())
                .desiredWeight(dto.getDesiredWeight())
                .email(dto.getEmail())
                .foods(new ArrayList<>()).build();
    }
}
