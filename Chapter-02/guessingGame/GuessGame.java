import java.util.Random;

public class GuessGame {
    int guessP1;
    int guessP2;
    int guessP3;

    void startGame() {
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        Random rand = new Random();
        while (!p1IsRight && !p2IsRight && !p3IsRight) {
            int winningNumber = rand.nextInt(0, 10);
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed " + guessP1);
            guessP2 = p2.number;
            System.out.println("Player 2 guessed " + guessP2);
            guessP3 = p3.number;
            System.out.println("Player 3 guessed " + guessP3);


            if (guessP1 == winningNumber) {
                p1IsRight = true;
            }
            if (guessP2 == winningNumber) {
                p2IsRight = true;
            }
            if (guessP3 == winningNumber) {
                p3IsRight = true;
            }

            System.out.println(p1IsRight ? "P1 has won the game," : "P1 has lost the game.");
            System.out.println(p2IsRight ? "P2 has won the game," : "P2 has lost the game.");
            System.out.println(p3IsRight ? "P3 has won the game," : "P3 has lost the game.");

            if (!p1IsRight && !p2IsRight && !p3IsRight) {
                System.out.println("No one won the game. A redo has been initiated.");
            }

        }

    }
}