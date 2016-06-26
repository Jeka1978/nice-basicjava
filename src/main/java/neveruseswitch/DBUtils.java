package neveruseswitch;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * Created by Jeka on 26/06/2016.
 */
public class DBUtils {
    private static DataFactory dataFactory = new DataFactory();
    public static MailInfo getMailInfo() {
        Random random = new Random();

        return new MailInfo(dataFactory.getName(), random.nextInt(2) + 1);
    }
}
