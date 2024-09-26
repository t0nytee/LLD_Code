package org.shruti.CricBuzzDesign.model.innings;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.MatchType;
import org.shruti.CricBuzzDesign.model.team.Team;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class InningDetails {
    private Team battingTeam;
    private Team bowlingTeam;

    private MatchType matchType;

    List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        this.overs = new ArrayList<>();
    }

    public void start(int runsToWin) {

    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }
}
