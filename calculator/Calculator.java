public class Calculator {

    public enum SIGN {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE
    }

    public static Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case MULTIPLY:
                return arg1 * arg2;
            default:
                return 0d;
        }
    }
}
