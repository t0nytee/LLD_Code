package org.shruti.CricBuzzDesign.model.scoreUpdater.impl;


import org.shruti.CricBuzzDesign.model.innings.BallDetails;
import org.shruti.CricBuzzDesign.model.innings.RunType;
import org.shruti.CricBuzzDesign.model.scoreUpdater.ScoreObserver;

public class BattingScoreObserver implements ScoreObserver {

    @Override
    public void update(BallDetails ballDetails) {
        int runs = getRunByRunType(ballDetails.getRunType());

        ballDetails.getPlayedBy().getBattingScoreCard().totalRuns+=runs;

    }

    int getRunByRunType(RunType runType) {
        switch (runType) {
            case ONE -> {
                return 1;
            }
            case SIX ->
            {
                return 6;
            }
            default -> {
                return 0;
            }
        }
    }
}
