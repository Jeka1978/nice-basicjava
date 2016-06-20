package heroes;

import java.util.Random;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Knight extends Character {

    private KickBehaviour kickBehaviour = new SwordKickBehaviour();

    public Knight() {
        Random random = new Random();
        setHp(2+random.nextInt(12));
        setPower(2+random.nextInt(12));
    }

    @Override
    public void kick(Character enemy) {
        kickBehaviour.kick(this,enemy);
    }
}
