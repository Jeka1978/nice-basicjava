package heroes;

import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;
import sun.reflect.Reflection;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Jeka on 20/06/2016.
 */
public class CharacterFactory {
    private List<Class<? extends Character>> characterTypes;

    public CharacterFactory() {
        Reflections reflections = new Reflections("heroes");
        Set<Class<? extends Character>> classes = reflections.getSubTypesOf(Character.class);
        characterTypes =
                classes.stream().
                        filter(c -> !Modifier.isAbstract(c.getModifiers())).
                        collect(Collectors.toList());
    }



    public Character createCharacter() throws IllegalAccessException, InstantiationException {
        Random random = new Random();
        int i = random.nextInt(characterTypes.size());
        Class<? extends Character> characterType = characterTypes.get(i);
        return characterType.newInstance();
    }




}



