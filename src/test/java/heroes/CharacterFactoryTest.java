package heroes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 20/06/2016.
 */
public class CharacterFactoryTest {
    @Test
    public void createCharacter() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();
        Character character = characterFactory.createCharacter();
        System.out.println(character);

    }

}