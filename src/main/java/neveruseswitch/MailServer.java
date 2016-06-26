package neveruseswitch;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jeka on 26/06/2016.
 */
public class MailServer {

    private Map<Integer, MailGenerator> mailGeneratorMap = new HashMap<>();

    public MailServer() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("neveruseswitch");
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                MailCode annotation = aClass.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new RuntimeException("if you implement " + MailGenerator.class.getSimpleName() + " you need to annotated your class with @MailCode");
                }
                int mailCode = annotation.value();
                if (mailGeneratorMap.containsKey(mailCode)) {
                    throw new RuntimeException("mail code " + mailCode + " was already used");
                }
                mailGeneratorMap.put(mailCode, aClass.newInstance());
            }
        }
    }

    public void sendMail() {
        MailInfo mailInfo = DBUtils.getMailInfo();
        MailGenerator mailGenerator = mailGeneratorMap.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new RuntimeException("mail code " + mailInfo.getMailCode()+" not supported yet");
        }
        String body = mailGenerator.generateBody(mailInfo);
        send(body);

    }

    private void send(String body) {
        System.out.println("sending... " + body);
    }
}






