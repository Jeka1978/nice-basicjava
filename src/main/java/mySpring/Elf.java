package mySpring;

import lombok.Data;

/**
 * Created by Jeka on 03/07/2016.
 */
@Data
public class Elf {

    @InjectRandomInt(min = 10, max = 20)
    private int hp;
    @InjectRandomInt(min = 25, max = 30)
    private int power;


}
