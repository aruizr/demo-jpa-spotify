package cat.tcm.laboritorisoftware2.demojpaspotify.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate birthDate;
    @OneToMany(mappedBy = "user")
    private List<LikedTrack> likedSongs;
    @OneToMany(mappedBy = "user")
    private List<LikedPlaylist> likedPlaylists;
}
