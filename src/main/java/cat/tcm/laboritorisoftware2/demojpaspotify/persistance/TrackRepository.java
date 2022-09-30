package cat.tcm.laboritorisoftware2.demojpaspotify.persistance;

import cat.tcm.laboritorisoftware2.demojpaspotify.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Long> {
    List<Track> findByDurationBetweenOrderByReleaseDate(Integer min, Integer max);
}
