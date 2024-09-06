import java.util.Random;

public class Die {
   private int currentValue;
   private int sides;


    public Die (int sides) {
         this.currentValue = 0;
         this.sides = sides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getSides() {
        return sides;
    }

   private static Random random = new Random();


    public int roll() {
        currentValue = random.nextInt(sides) + 1;
        return currentValue;
    }
}

