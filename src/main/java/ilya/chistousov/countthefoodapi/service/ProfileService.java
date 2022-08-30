package ilya.chistousov.countthefoodapi.service;

import ilya.chistousov.countthefoodapi.entity.Profile;
import ilya.chistousov.countthefoodapi.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public void createProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public Optional<Profile> findProfileByEmail(String email) {
        return profileRepository.findProfileByEmail(email);
    }

    public void updateProfile(Profile newProfile) {
        profileRepository.findProfileByEmail(newProfile.getEmail())
                .ifPresent(profile -> {
                    profile.setActivityLevel(newProfile.getActivityLevel());
                    profile.setBirthDate(newProfile.getBirthDate());
                    profile.setCurrentGrowth(newProfile.getCurrentGrowth());
                    profile.setCurrentWeight(newProfile.getCurrentWeight());
                    profile.setDesiredWeight(newProfile.getDesiredWeight());
                    profileRepository.save(profile);
                });
    }

    public void deleteProfileByEmail(String email) {
        profileRepository.deleteProfileByEmail(email);
    }
}
