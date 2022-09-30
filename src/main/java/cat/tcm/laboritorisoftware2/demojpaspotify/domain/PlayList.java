package cat.tcm.laboritorisoftware2.demojpaspotify.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDateTime creationDate;
    private Boolean isPublic;
    @ManyToOne
    private User creator;
    @ManyToMany
    private List<User> collaborators;
    @ManyToMany
    private List<Track> tracks;
}
