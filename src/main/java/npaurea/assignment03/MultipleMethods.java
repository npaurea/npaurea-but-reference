package npaurea.assignment03;

import java.util.Date;

public class MultipleMethods {
    public static String stringField;

    public final static String stringField2 = "GOTCHA!";

    protected final static String stringField3 = "GOTCHA!";

    public final String stringField4 = "GOTCHA!";

    public final Date dateField = new Date();

    public String getStaticFieldValue() {
        return stringField;
    }

    public Date getStaticDateFieldValue() {
        return dateField;
    }

}
