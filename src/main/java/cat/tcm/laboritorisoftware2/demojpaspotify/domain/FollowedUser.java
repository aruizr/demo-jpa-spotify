package cat.tcm.laboritorisoftware2.demojpaspotify.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@ToString
@Entity
public class FollowedUser extends ActionEntity {
    @ManyToOne
    private User followedUser;
}
