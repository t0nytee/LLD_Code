package org.shruti.CricBuzzDesign.model.team;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.innings.BallDetails;
import org.shruti.CricBuzzDesign.model.innings.OverDetails;
import org.shruti.CricBuzzDesign.model.team.player.PlayerDetails;


@Getter
@Setter
@Builder
public class Wicket {

    WicketType wicketType;
    PlayerDetails takenBy;

    OverDetails overDetails;
    BallDetails ballDetails;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetails, BallDetails ballDetails) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }
}
