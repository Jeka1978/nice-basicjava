package heroes;

import lombok.Data;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Jeka on 20/06/2016.
 */
@Data
public abstract class Character {
    private int hp;
    private int power;
    private String name;
    private DataFactory dataFactory = new DataFactory();

    public Character(){
        name = dataFactory.getName();
    }


    public boolean isAlive() {
        return hp>0;
    }

    public abstract void kick(Character enemy);


    public void decreasePower(int amount) {
        setPower(getPower()-amount);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + name + " hp= " + hp + " power= " + power;
    }

    public void decreaseHp(int hpToDecrease) {
        setHp(getHp()-hpToDecrease);
    }
}




