
import java.util.ArrayList;

import Controller.Controller;
import Classes.Toy;

public class App {
    
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Lego",200, 20));
        toys.add(new Toy(2, "Cars",300, 30));
        toys.add(new Toy(3, "Puzzles",100, 10));
        toys.add(new Toy(4, "Balls",100, 10));
        toys.add(new Toy(5, "Baloons", 300, 30));

        int numberOfPrizes =5; // Сколько нужно призов получить

        controller.fileWriter(toys, "lottery_result.txt", numberOfPrizes);

     
    }
}
