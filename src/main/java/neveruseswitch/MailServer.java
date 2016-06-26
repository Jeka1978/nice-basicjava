package neveruseswitch;

/**
 * Created by Jeka on 26/06/2016.
 */
public class MailServer {
    public void sendMail() {
        MailInfo mailInfo = DBUtils.getMailInfo();
        switch (mailInfo.getMailCode()) {
            case 1:
                //50 lines of code
                System.out.println("Welcome new client");
                break;
            default:
                //70 lines of code
                System.out.println("Don't call us we call you");
                break;
        }
    }
}
