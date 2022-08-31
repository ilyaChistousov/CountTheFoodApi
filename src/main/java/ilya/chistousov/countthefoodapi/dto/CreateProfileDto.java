package ilya.chistousov.countthefoodapi.dto;

import lombok.Data;

@Data
public class CreateProfileDto {

    private String gender;

    private String goal;

    private String birthDate;

    private String activityLevel;

    private Integer currentGrowth;

    private Float currentWeight;

    private Float desiredWeight;

    private String email;
}
