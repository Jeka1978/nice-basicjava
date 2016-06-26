package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 26/06/2016.
 */
@Component
@Scope("singleton")
public class MaamServiceImpl implements MaamService {

    private MaamServiceImpl(){
        System.out.println("I was created");
    }
    @Override
    public double getMaam() {
        return 0.18;
    }
}
