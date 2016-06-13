package enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeka on 13/06/2016.
 */
public enum  MaritalStatus {
    SINGLE(1,"רווק"),
    MARRIED(2,"נשוי"),
    DIVORCED(3,"גרוש"),
    WIDOW(5,"אלמן");

    private final int dbCode;
    private final String hebrewDesc;


    MaritalStatus(int dbCode, String hebrewDesc) {
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
    }

    public int getDbCode() {
        return dbCode;
    }

    public String getHebrewDesc() {
        return hebrewDesc;
    }

    @Override
    public String toString() {
        return hebrewDesc;
    }


    static MaritalStatus findByDbCode(int dbCode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new RuntimeException(dbCode + " not exist");

    }











}
