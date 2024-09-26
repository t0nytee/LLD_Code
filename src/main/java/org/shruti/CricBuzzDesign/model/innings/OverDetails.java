package org.shruti.CricBuzzDesign.model.innings;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.team.Team;
import org.shruti.CricBuzzDesign.model.team.player.PlayerDetails;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class OverDetails {
    int overNumber;
    List<BallDetails> ballDetailsList;

    int extraBallCount;

    PlayerDetails bowledBy;

    public OverDetails(int overNumber, PlayerDetails bowledBy) {
        this.overNumber = overNumber;
        this.ballDetailsList = new ArrayList<>();
        this.bowledBy = bowledBy;
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) {

        return true;
    }
}
