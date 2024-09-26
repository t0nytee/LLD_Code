package org.shruti.CricBuzzDesign.model.team.player.score;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BowlingScoreCard {

    public int totalOversCount;
    public int totalRunsGiven;
    public int wicketTaken;
    public int noBallsCount;
    public int wideBallCount;
    public double economyRate;

}
