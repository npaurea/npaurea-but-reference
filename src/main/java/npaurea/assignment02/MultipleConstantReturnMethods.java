package npaurea.assignment02;

public class MultipleConstantReturnMethods {
    public static final String THE_CONSTANT_VALUE = "String Constant";

    public static final String THE_CONSTANT_VALUE2 = "String Constant 2";

    public final String THE_CONSTANT_VALUE_GOTCHA = "String Constant GOTCHA!";

    private static final String THE_CONSTANT_VALUE_GOTCHA2 = "String Constant GOTCHA2!";

    public static String THE_CONSTANT_VALUE_GOTCHA3 = "String Constant GOTCHA3!";

    public String getConstantValue() {
        return THE_CONSTANT_VALUE;
    }

    public String getConstantValueGotcha() {
        return THE_CONSTANT_VALUE_GOTCHA;
    }

    public String getConstantValueGotcha2() {
        return THE_CONSTANT_VALUE_GOTCHA2;
    }

    public String getConstantValueGotcha3() {
        return THE_CONSTANT_VALUE_GOTCHA3;
    }

    public String getConstantValue2() {
        return THE_CONSTANT_VALUE2;
    }

    public String getConstantValue3() {
        return THE_CONSTANT_VALUE;
    }
}
