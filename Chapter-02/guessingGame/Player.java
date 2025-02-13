import java.util.Random;

public class Player {
    int number;

    void guess() {
        Random rand = new Random();
        number = rand.nextInt(0, 10);
    }

}