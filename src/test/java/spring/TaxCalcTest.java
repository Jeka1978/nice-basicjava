package spring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 26/06/2016.
 */
public class TaxCalcTest {
    @Test
    public void afterMaam() throws Exception {
        MaamService mock = Mockito.mock(MaamService.class);
        Mockito.when(mock.getMaam()).thenReturn(0.10);
        TaxCalc taxCalc = new TaxCalc();
        taxCalc.setMaamService(mock);
        Assert.assertEquals(110,taxCalc.afterMaam(100),0.001);
    }

}