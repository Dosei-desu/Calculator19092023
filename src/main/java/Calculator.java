public class Calculator {
    public static double plusCalc(double a, double b){
        double result = a + b;
        return result;
    }

    public static double minusCalc(double a, double b){
        double result = a - b;
        return result;
    }

    public static double divideCalc(double a, double b){
        if(b != 0){
            double result = a / b;
            return result;
        }
        return 0;
    }

    public static double multiplyCalc(double a, double b){
        double result = a * b;
        return result;
    }
}
