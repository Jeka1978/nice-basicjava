package tdd;

/**
 * Created by Jeka on 26/06/2016.
 */
public class MaamService {
    private MaamResolver maamResolver;

    public void setMaamResolver(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    public double afterMaam(double price) {
        return price * maamResolver.getMaam()+price;
    }



}
