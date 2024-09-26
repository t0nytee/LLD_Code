package org.shruti.CricBuzzDesign.model.scoreUpdater.impl;


import org.shruti.CricBuzzDesign.model.innings.BallDetails;
import org.shruti.CricBuzzDesign.model.innings.RunType;
import org.shruti.CricBuzzDesign.model.scoreUpdater.ScoreObserver;

public class BowlingScoreObserver implements ScoreObserver {

    @Override
    public void update(BallDetails ballDetails) {
        int runs = getRunByRunType(ballDetails.getRunType());

        ballDetails.getBowledBy().getBowlingScoreCard().totalRunsGiven+=runs;
        // update others
        // in real project, add public methods for increasing these values

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
