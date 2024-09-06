import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Player> initialize() {


        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Hur många spelare?");
        int numberOfPlayers = scanner.nextInt();
        System.out.println("Hur många tärningar ska varje spelare ha?");
        int numberOfDice = scanner.nextInt();


        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("ange namn för spelare" + (i + 1) + ":");
            String name = scanner.next();
            Player player = new Player(name, numberOfDice);
            players.add(player);
        }
        return players;
    }

    public void takeTurn(ArrayList<Player> players) {
        int numberOfRounds = 2;
        for (int round = 1; round <= numberOfRounds; round++) {
            System.out.println("----- Runda " + round + " -----");

            for (Player player : players) {
                System.out.println(player.getName() + " Gissa summan av tärningskasten:");
                int guess = scanner.nextInt();
                int totalSum = player.rollDice();

                System.out.println("Tärningarna visade: " + totalSum);
                if (guess == totalSum) {
                    System.out.println("Du gissade rätt !! 1 poäng till dig :)");
                    player.incrementScore();
                } else {
                    System.out.println("Du gissade fel, bättre lycka nästa gång!");
                }
            }

        }


    }

    public void endGame(ArrayList<Player> players) {
        Player winner = null;
        int highestScore = 0;
        System.out.println("\nSpelet är slut, här kommer era resultat");
        for (Player player : players) {

            System.out.println(player.getName() + ": " + player.getScore());
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
                winner = player;
            }
        }
        if (winner != null) {
            System.out.println("\nVinnaren är: " + winner.getName() + " med " + winner.getScore() + " poäng! Grattis!");
        } else {
            System.out.println("Ingen vann denna omgång!!");
        }
    }
}
