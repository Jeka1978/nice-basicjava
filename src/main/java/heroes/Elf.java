package heroes;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Elf extends Character {

    public Elf() {
        setHp(10);
        setPower(10);
    }

    @Override
    public void kick(Character enemy) {
        if (this.getPower() > enemy.getPower()) {
            enemy.setHp(0);
        }else {
            enemy.decreasePower(1);
        }
    }
}
