package heroes;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Hobbit extends Character {

    public Hobbit() {
        this.setHp(3);
    }

    @Override
    public void kick(Character enemy) {
        cry();
    }

    private void cry() {
        System.out.println("au au a ua don't kill me!!!");
    }
}
