package org.shruti.CricBuzzDesign.model.team.player.score;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.team.Wicket;

@Setter
@Getter
@Builder
public class BattingScoreCard {
    public int totalRuns;
    public int totalBallsPlayed;

    public int noOfFours;
    public int noOfSixs;

    public double strikeRate;

    public Wicket wicket;



}
