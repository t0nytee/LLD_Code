package org.shruti.CricBuzzDesign;

public class T20MatchType implements MatchType{

    @Override
    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxOverCountBowler() {
        return 5;
    }
}
