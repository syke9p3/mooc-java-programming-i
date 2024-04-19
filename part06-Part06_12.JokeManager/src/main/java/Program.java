
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager jokeManager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface userInterface = new UserInterface(jokeManager, scanner);
        userInterface.start();
    }
}
