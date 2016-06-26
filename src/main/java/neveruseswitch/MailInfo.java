package neveruseswitch;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jeka on 26/06/2016.
 */
@Data
@AllArgsConstructor
public class MailInfo {
    private String clientName;
    private int mailCode;
}
