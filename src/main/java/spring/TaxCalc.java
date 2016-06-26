package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 26/06/2016.
 */
@Component
public class TaxCalc {
    @Autowired
    private MaamService maamService;

    public void setMaamService(MaamService maamService) {
        this.maamService = maamService;
    }

    public double afterMaam(double price) {
        return price + price * maamService.getMaam();
    }
}
