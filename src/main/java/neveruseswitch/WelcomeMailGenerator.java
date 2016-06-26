package neveruseswitch;

/**
 * Created by Jeka on 26/06/2016.
 */

@MailCode(1)
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody(MailInfo mailInfo) {
        //50 lines of code
        return "Welcome " + mailInfo.getClientName();
    }
}
