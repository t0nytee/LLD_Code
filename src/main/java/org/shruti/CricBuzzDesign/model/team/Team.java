package org.shruti.CricBuzzDesign.model.team;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.team.player.PlayerBattingController;
import org.shruti.CricBuzzDesign.model.team.player.PlayerBowlingController;
import org.shruti.CricBuzzDesign.model.team.player.PlayerDetails;


import java.util.Deque;
import java.util.List;
import java.util.Queue;


@Getter
@Setter
@Builder
public class Team {
    private String teamName;

    private int totalRuns;
    private boolean isWinner;

    Queue<PlayerDetails> players11;
    Queue<PlayerDetails> bench;

    PlayerBattingController playerBattingController;
    PlayerBowlingController playerBowlingController;

    public Team(String teamName, Queue<PlayerDetails> players11, Queue<PlayerDetails> bench) {
        this.teamName = teamName;
        this.players11 = players11;
        this.bench = bench;
        this.playerBattingController = new PlayerBattingController();
        this.playerBowlingController = new PlayerBowlingController();
    }
}
