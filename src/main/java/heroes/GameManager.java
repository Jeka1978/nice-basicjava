package heroes;

/**
 * Created by Jeka on 20/06/2016.
 */
public class GameManager {

    public Character fight(Character c1, Character c2) throws InstantiationException, IllegalAccessException {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            printState(c1, c2);
            if (c2.isAlive()) {
                c2.kick(c1);
                printState(c2, c1);
            }
        }
        if (c1.isAlive()) {
            return processWinner(c1);
        }else {
            return processWinner(c2);
        }
    }

    private Character processWinner(Character c1) {
        System.out.println(c1+" won!!!");
        return c1;
    }

    private void printState(Character c1, Character c2) {
        System.out.println(c1.getName()+"kick "+c2.getName());
        System.out.println(c2);
    }
}
