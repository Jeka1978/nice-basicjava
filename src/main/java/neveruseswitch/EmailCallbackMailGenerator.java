package neveruseswitch;

/**
 * Created by Jeka on 26/06/2016.
 */
@MailCode(2)
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateBody(MailInfo mailInfo) {
        // 70 lines of code
        return "don't call us we call you";
    }

}
