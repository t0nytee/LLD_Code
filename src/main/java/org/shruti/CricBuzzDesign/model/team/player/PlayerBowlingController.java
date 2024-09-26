package org.shruti.CricBuzzDesign.model.team.player;

import java.util.Deque;
import java.util.Map;

public class PlayerBowlingController {

    Deque<PlayerDetails> bowlerList;
    Map<PlayerDetails, Integer> bowlerOverCount;

    PlayerDetails currentBowler;

    public PlayerDetails getCurrentBowler() {
        return currentBowler;
    }
    public void setNextBowler() {
        currentBowler = bowlerList.poll();
        
    }

}
