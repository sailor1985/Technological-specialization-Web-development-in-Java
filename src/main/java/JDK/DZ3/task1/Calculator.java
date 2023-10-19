package JDK.DZ3.task1;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        Object sum = null;
        if (a instanceof Integer && b instanceof Integer) {
            sum = a.intValue() + b.intValue();
        } else if (a instanceof Integer && b instanceof Double) {
            sum = a.intValue() + b.doubleValue();
        } else if (a instanceof Double && b instanceof Integer) {
            sum = a.doubleValue() + b.intValue();
        } else if (a instanceof Double && b instanceof Double) {
            sum = a.doubleValue() + b.doubleValue();
        }
        return (T) sum;
    }

    public static <T extends Number> T multiply(T a, T b) {
        Object mult = null;
        if (a instanceof Integer && b instanceof Integer) {
            mult = a.intValue() * b.intValue();
        } else if (a instanceof Integer && b instanceof Double) {
            mult = a.intValue() * b.doubleValue();
        } else if (a instanceof Double && b instanceof Integer) {
            mult = a.doubleValue() * b.intValue();
        } else if (a instanceof Double && b instanceof Double) {
            mult = a.doubleValue() * b.doubleValue();
        }
        return (T) mult;
    }

    public static <T extends Number> T divide(T a, T b) {
        Object div = null;
        if (a instanceof Integer && b instanceof Integer) {
            div = a.intValue() / b.intValue();
        } else if (a instanceof Integer && b instanceof Double) {
            div = a.intValue() / b.doubleValue();
        } else if (a instanceof Double && b instanceof Integer) {
            div = a.doubleValue() / b.intValue();
        } else if (a instanceof Double && b instanceof Double) {
            div = a.doubleValue() / b.doubleValue();
        }
        return (T) div;
    }

    public static <T extends Number> T subtract(T a, T b) {
        Object subtr = null;
        if (a instanceof Integer && b instanceof Integer) {
            subtr = a.intValue() - b.intValue();
        } else if (a instanceof Integer && b instanceof Double) {
            subtr = a.intValue() - b.doubleValue();
        } else if (a instanceof Double && b instanceof Integer) {
            subtr = a.doubleValue() - b.intValue();
        } else if (a instanceof Double && b instanceof Double) {
            subtr = a.doubleValue() - b.doubleValue();
        }
        return (T) subtr;
    }







}
