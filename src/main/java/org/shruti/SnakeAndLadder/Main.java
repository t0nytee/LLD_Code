package org.shruti.SnakeAndLadder;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class Main {
    static int rollDice() {
        Random random = new Random();
        return 1+ random.nextInt(6);
    }

    static int getEndPosition(String player, int endPos, Map<Integer, Integer> snakes, Map<Integer, Integer> ladder) {
        if(snakes.containsKey(endPos)) {
            System.out.println(player + " moved to " + endPos + " due to snake " );
            return getEndPosition(player,snakes.get(endPos), snakes, ladder);
        }
        if(ladder.containsKey(endPos)) {
            System.out.println(player + " moved to " + endPos + " due to ladder " );
            return getEndPosition(player, ladder.get(endPos), snakes, ladder);
        }
        return endPos;
    }

    public static void main(String[] args) {
        int M = 100;

        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladder = new HashMap<>();

        snakes.put(20, 5);
        snakes.put(53, 23);
        snakes.put(87, 45);
        snakes.put(93, 4);
        snakes.put(70, 56);
        snakes.put(80, 38);

        ladder.put(6, 60);
        ladder.put(60, 80);
        ladder.put(34, 89);
        ladder.put(67, 97);
        ladder.put(50, 78);
        ladder.put(89, 95);

        Deque<Player> q = new LinkedList<>();
        Player player1 = Player.builder().id(1).name("player1").pos(0).build();
        Player player2 = Player.builder().id(2).name("player2").pos(0).build();
        q.add(player1);
        q.add(player2);

        boolean isWinner = false;
        while(isWinner==false) {
            Player curPlayer = q.pollFirst();
            int diceNo = rollDice();
            int curPos = curPlayer.getPos();
            if(curPos + diceNo == 100) {
                System.out.println(curPlayer.getName() + " wins the game");
                isWinner = true;
            }
            if(curPos + diceNo <100) {
                int endPos = getEndPosition(curPlayer.getName(), curPos + diceNo, snakes, ladder);
                curPlayer.setPos(endPos);
                System.out.println(curPlayer.getName() + " rolled a " + diceNo + " and moved from " + curPos + " to " + endPos);
            }
            q.addLast(curPlayer);
        }
    }
}
