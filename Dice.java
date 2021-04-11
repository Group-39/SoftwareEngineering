package Cluedo;

import java.util.Random;
public class Dice {
    
    private Random randNUM;

    Dice() {

        randNUM = new Random();
    }

    int rollDice() {
        return randNUM.nextInt(6) +1 ; 
    }
}
