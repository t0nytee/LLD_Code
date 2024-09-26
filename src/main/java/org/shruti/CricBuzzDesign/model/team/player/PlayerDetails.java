package org.shruti.CricBuzzDesign.model.team.player;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.shruti.CricBuzzDesign.model.team.player.score.BattingScoreCard;
import org.shruti.CricBuzzDesign.model.team.player.score.BowlingScoreCard;

@Getter
@Setter
@Builder
public class PlayerDetails {
    Person person;
    PlayerType playerType;
    BattingScoreCard battingScoreCard;
    BowlingScoreCard bowlingScoreCard;

}
