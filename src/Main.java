import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initierar spelet Och skapar spelarna med sina tärningar
        ArrayList<Player> players = Game.initialize();
        //skapar ett game objekt
        Game game = new Game();
        //skickar spelarna till metoden som ger spellogiken för 5 rundor
        game.takeTurn(players);
        //avsluta spelet och presentera ev Vinnare
        game.endGame(players);
    }
}