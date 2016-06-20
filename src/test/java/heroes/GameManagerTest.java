package heroes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 20/06/2016.
 */
public class GameManagerTest {
    @Test
    public void fight() throws Exception {
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);

    }

    @Test
    public void testElfAlwaysWinsHobbit() throws IllegalAccessException, InstantiationException {
        for (int i=0;i<10;i++) {
            Elf elf = new Elf();
            Hobbit hobbit = new Hobbit();
            GameManager gameManager = new GameManager();
            Character character = gameManager.fight(elf, hobbit);
            Assert.assertEquals(Elf.class,character.getClass());
        }


    }

}