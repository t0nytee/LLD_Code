package org.shruti.CricBuzzDesign;

import org.shruti.CricBuzzDesign.model.innings.InningDetails;
import org.shruti.CricBuzzDesign.model.team.Team;

import java.util.Date;

public class Match {

    Team teamA;
    Team teamB;

    Date matchDate;

    MatchType matchType;

    String venue;

    Team tossWinner;

    InningDetails[] innings;

    public Match(Team teamA, Team teamB, Date matchDate, MatchType matchType, String venue) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.matchType = matchType;
        this.venue = venue;
        this.innings = new InningDetails[2];
    }

    public Match( ){

    }

    public void startMatch() {

    }

    public boolean toss() {
        return true;
    }

}
