package org.shruti.CricBuzzDesign.model.innings;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.scoreUpdater.ScoreObserver;
import org.shruti.CricBuzzDesign.model.scoreUpdater.impl.BattingScoreObserver;
import org.shruti.CricBuzzDesign.model.scoreUpdater.impl.BowlingScoreObserver;
import org.shruti.CricBuzzDesign.model.team.Wicket;
import org.shruti.CricBuzzDesign.model.team.player.PlayerDetails;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class BallDetails {
    private int ballNumber;
    private BallType ballType;
    private RunType runType;
    private PlayerDetails playedBy;
    private PlayerDetails bowledBy;

    private Wicket wicket;

    List<ScoreObserver> scoreObserverList;

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
        this.scoreObserverList = new ArrayList<>();
        this.scoreObserverList.add(new BattingScoreObserver());
        this.scoreObserverList.add(new BowlingScoreObserver());

    }

    public void startBowlDelivery() {

    }

    public void notifyObservers(BallDetails ballDetails) {
        for(ScoreObserver scoreObserver : scoreObserverList) {
            scoreObserver.update(ballDetails);
        }
    }

    public RunType getRunType() {
        return RunType.FOUR;
    }

    public boolean isWicketTaken() {
        return false;
    }





}
