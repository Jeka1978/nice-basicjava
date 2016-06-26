package neveruseswitch;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InterruptedException {
        MailServer mailServer = new MailServer();
        while (true) {
            try {
                mailServer.sendMail();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(1000);
        }

    }
}
