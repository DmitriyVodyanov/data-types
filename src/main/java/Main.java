public class Main {
    public static void main(String[] args) {
        byte byteTypeMax = Byte.MAX_VALUE;
        byte byteType = 22;
        byte byteTypeMin = Byte.MIN_VALUE;
        short shortTypeMax = Short.MAX_VALUE;
        short shortType = 8;
        short shortTypeMin = Short.MIN_VALUE;
        int intTypeMax = Integer.MAX_VALUE;
        int intType = 99999;
        int intTypeMin = Integer.MIN_VALUE;
        long longTypeMax = Long.MAX_VALUE;
        long longType = 999999;
        long longTypeMin = Long.MIN_VALUE;
        double doubleTypeMax = Double.MAX_VALUE;
        double doubleType = 8.9;
        double doubleTypeMin = Double.MIN_VALUE;
        float floatTypeMax = Float.MAX_VALUE;
        float floatType = 9.1f;
        float floatTypeMin = Float.MIN_VALUE;
        char charTypeMax = Character.MAX_VALUE;
        char charType = 's';
        char charTypeMin = Character.MIN_VALUE;
        String stringType = "text";
        boolean booleanTypeTrue = true;
        boolean booleanTypeFalse = false;
    }

    double calculateExample (int a, int b, int c, int d) {
        double result = a * (b + (c / d));
        return result;
    }

    static boolean sumValueCheckInterval(int valueOne, int valueTwo) {
        int sum = valueOne + valueTwo;
        return (sum >= 10 && sum <= 20);
    }

    static boolean negativeNumber(int number) {
        return (number < 0);
    }

    static boolean positiveNumber(int number) {
        return (number >= 0);
    }

    static void printName(String name) {
        System.out.printf("Привет, %s", name);
    }

    static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
