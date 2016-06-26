package neveruseswitch;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Jeka on 26/06/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MailCodes{
    MailCode[] value();
}
