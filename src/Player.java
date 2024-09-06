import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private List<Die> dice;

    public Player(String name, int numberOfDice) {
        this.name = name;
        this.score = 0;
        this.dice = new ArrayList<>();

        for (int i = 0; i < numberOfDice; i++) {
            this.dice.add(new Die(6));
        }
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public List<Die> getDice() {
        return dice;
    }

    public int rollDice() {
        int totalSum = 0;

        for (Die die : dice) {
            totalSum += die.roll();
        }
        return totalSum;
    }

    public void incrementScore() {
        this.score++;
    }

}
