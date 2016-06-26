package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 26/06/2016.
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamResolver2 mock = Mockito.mock(MaamResolver2.class);
        Mockito.when(mock.getMaam()).thenReturn(17.0);

        //?????????????
        Assert.assertEquals(117,taxCalculator.withMaam(100),00.1);
    }

}