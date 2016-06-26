package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tdd.TaxCalculator;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext("spring");
        TaxCalc taxCalculator = spring.getBean(TaxCalc.class);
        double withMaam = taxCalculator.afterMaam(1000);
        System.out.println("withMaam = " + withMaam);
        spring.getBean(MaamService.class);
        spring.getBean(MaamService.class);
    }
}
