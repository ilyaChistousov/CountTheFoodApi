package ilya.chistousov.countthefoodapi.controller;

import ilya.chistousov.countthefoodapi.entity.Profile;
import ilya.chistousov.countthefoodapi.entity.ProfileFood;
import ilya.chistousov.countthefoodapi.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/create")
    public void createProfile(@RequestBody Profile profile) {
        profileService.createProfile(profile);
    }

    @GetMapping("/{email}")
    public Profile findProfileByEmail(@PathVariable String email) {
        var maybeProfile = profileService.findProfileByEmail(email);
        return maybeProfile.orElseThrow();
    }

    @PutMapping
    public void updateProfile(@RequestBody Profile profile) {
        profileService.updateProfile(profile);
    }

    @PatchMapping("/{email}")
    public void addFoodToProfile(@PathVariable String email, @RequestBody ProfileFood food ) {
        profileService.addFoodToProfile(email, food);
    }

    @DeleteMapping("/{email}")
    public void deleteProfileByEmail(@PathVariable String email) {
        var maybeProfile = profileService.findProfileByEmail(email);
        maybeProfile.ifPresent(p -> profileService.deleteProfileByEmail(email));
    }
}
