package cat.tcm.laboritorisoftware2.demojpaspotify.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ActionEntity<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime date;
    @ManyToOne
    private User user;
    @ManyToOne
    private T entity;
}
