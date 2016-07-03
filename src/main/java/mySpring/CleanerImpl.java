package mySpring;

import lombok.EqualsAndHashCode;

/**
 * Created by Jeka on 03/07/2016.
 */
@EqualsAndHashCode
public class CleanerImpl implements Cleaner {
    @Override
    public void clean() {
        System.out.println("VVVVVVVVVVVVvvvvvvvvvvvvvvvvvvvvvvvv");
    }
}
