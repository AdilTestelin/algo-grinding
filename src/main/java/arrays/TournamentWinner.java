package arrays;

import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    /**
     * There’s an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as possible.
     * Teams compete in a round robin, where each team faces off against all other teams.
     * Only two teams compete against each other at a time, and for each competition, one team is designated the home team, while the other team is the away team.
     * In each competition there’s always one winner and one loser; there are no ties.
     * A team receives 3 points if it wins and 0 points if it loses.
     * The winner of the tournament is the team that receives the most amount of points.
     * <p>
     * Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition, write a function that returns the winner of the tournament.
     * The input arrays are named competitions and results, respectively.
     * The competitions array has elements in the form of [homeTeam, awayTeam], where each team is a string of at most 30 characters representing the name of the team.
     * The results array contains information about the winner of each corresponding competition in the competitions array.
     * Specifically, results[i] denotes the winner of competitions[i], where a 1 in the results array means that the home team in the corresponding competition won and a 0 means that the away team won.
     * <p>
     * It’s guaranteed that exactly one team will win the tournament and that each team will compete against all other teams exactly once.
     * It’s also guaranteed that the tournament will always have at least two teams.
     */

    public static String tournamentWinner(String[][] competitions, int[] result) {
        Map<String, Integer> teamScores = new HashMap<>();
        for (int i = 0; i < competitions.length; i++) {
            String homeTeam = competitions[i][0];
            String awayTeam = competitions[i][1];

            if (result[i] == 0) {
                if (teamScores.containsKey(awayTeam)) {
                    teamScores.put(awayTeam, teamScores.get(awayTeam) + 1);
                } else {
                    teamScores.put(awayTeam, 1);
                }
            } else {
                if (teamScores.containsKey(homeTeam)) {
                    teamScores.put(homeTeam, teamScores.get(homeTeam) + 1);
                } else {
                    teamScores.put(homeTeam, 1);
                }
            }
        }

        int maxScore = 0;
        String winingTeam = "";

        for (Map.Entry<String, Integer> team : teamScores.entrySet()) {
            if (team.getValue() > maxScore) {
                winingTeam = team.getKey();
            }
        }
        return winingTeam;
    }

    public static void main(String[] args) {
        String[][] competitions = {
                {"HTML", "C#"},
                {"C#", "Python"},
                {"Python", "HTML"}
        };

        int[] results = {0, 0, 1};

        System.out.println(tournamentWinner(competitions, results));
    }
}
