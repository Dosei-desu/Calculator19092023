public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 23.72;
        System.out.printf("%.2f + %.2f = %.2f",a,b,Calculator.plusCalc(a,b));
        System.out.printf("\n%.2f - %.2f = %.2f",a,b,Calculator.minusCalc(a,b));
        System.out.printf("\n%.2f * %.2f = %.2f",a,b,Calculator.multiplyCalc(a,b));
        System.out.printf("\n%.2f / %.2f = %.2f",a,b,Calculator.divideCalc(a,b));
    }
}
