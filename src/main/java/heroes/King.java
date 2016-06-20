package heroes;

import java.util.Random;

/**
 * Created by Jeka on 20/06/2016.
 */
public class King extends Character {

    private KickBehaviour kickBehaviour = new SwordKickBehaviour();

    public King() {
        Random random = new Random();
        setHp(5+random.nextInt(10));
        setPower(5+random.nextInt(10));
    }

    @Override
    public void kick(Character enemy) {
        kickBehaviour.kick(this,enemy);
    }
}
