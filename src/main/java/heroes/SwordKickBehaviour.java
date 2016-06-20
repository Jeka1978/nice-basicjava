package heroes;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Jeka on 20/06/2016.
 */
public class SwordKickBehaviour implements KickBehaviour {
    private DataFactory dataFactory = new DataFactory();
    @Override
    public void kick(Character c1, Character c2) {
        int hpToDecrease = dataFactory.getNumberUpTo(c1.getPower());
        c2.decreaseHp(hpToDecrease);

    }
}
