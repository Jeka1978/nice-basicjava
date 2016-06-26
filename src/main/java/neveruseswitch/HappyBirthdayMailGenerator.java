package neveruseswitch;

/**
 * Created by Jeka on 26/06/2016.
 */
@MailCode(3)
public class HappyBirthdayMailGenerator implements MailGenerator {
  void tryToSaveResource(){

    }

    @Override
    public String generateBody(MailInfo mailInfo) {
        return "Happy Birthday " + mailInfo.getClientName();
    }
}
