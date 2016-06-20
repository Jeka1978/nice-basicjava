package guessGame;

import heroes.Character;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Game {
    public static void main(String[] args) {
        while (true) {

            int number = 0;
            String userInput = JOptionPane.showInputDialog("what is your number");
            if (StringUtils.isNumeric(userInput)) {
                number = Integer.parseInt(userInput);
                if (number != 7) {
                    System.out.println("wrong");
                } else {
                    System.out.println("Great! You WON!");
                    break;
                }
            }else {
                System.out.println("Only numbers!!!");
            }
        }
    }
}
