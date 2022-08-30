package ilya.chistousov.countthefoodapi.repository;

import ilya.chistousov.countthefoodapi.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Optional<Profile> findProfileByEmail(String email);

    void deleteProfileByEmail(String email);
}
