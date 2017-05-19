package ch.hesge.flavio;

public class Game {

    private int rounds = 0;
    private Tumbler tumbler;
    private Player player1, player2;
    
    
    public Game() {
        tumbler = new Tumbler();
        player1 = new Player("Flavio");
        player2 = new Player("John");
    }

    public String play() {
        if (rounds >= 3){
            return "No players have won the game!";
        }
        rounds++;
        if (player1.play(tumbler)){
            return player1.getName() + " has won the game!";
        }
        if (player2.play(tumbler)){
            return player2.getName() + " has won the game!";
        }
        return play();
    }
}
