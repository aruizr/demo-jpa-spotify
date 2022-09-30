package cat.tcm.laboritorisoftware2.demojpaspotify.persistance;

import cat.tcm.laboritorisoftware2.demojpaspotify.domain.LikedPlaylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface LikedPlaylistRepository extends JpaRepository<LikedPlaylist, Long> {
    List<LikedPlaylist> findByUserId(Long userId);

    @Query("""
            select l
            from LikedPlaylist l
            where l.playList.name like concat('%', :name, '%')
            and l.playList.creationDate < :creationDate
            and l.user.birthDate between :birthDateStart
            and :birthDateEnd
            and l.playList.isPublic = true
            and l.date > :date""")
    List<LikedPlaylist> findMyLikes(@Param("name") String name, @Param("creationDate") LocalDateTime creationDate, @Param("birthDateStart") LocalDate birthDateStart, @Param("birthDateEnd") LocalDate birthDateEnd, @Param("date") LocalDateTime date);
}
