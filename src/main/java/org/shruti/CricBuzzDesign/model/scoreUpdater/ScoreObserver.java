package org.shruti.CricBuzzDesign.model.scoreUpdater;


import org.shruti.CricBuzzDesign.model.innings.BallDetails;

public interface ScoreObserver {
    public void update(BallDetails ballDetails);
}
