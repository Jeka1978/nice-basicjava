package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 26/06/2016.
 */
public class MaamServiceTest {
    @Test
    public void afterMaam() throws Exception {
        MaamService maamService = new MaamService();

        MaamResolver maamResolverMock = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolverMock.getMaam()).thenReturn(0.17);

        maamService.setMaamResolver(maamResolverMock);

//        maamService.setMaamResolver(() -> 0.17);
        Assert.assertEquals(117,maamService.afterMaam(100),0.001);
    }

}