import java.awt.desktop.AboutEvent;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double q = 1;
        double a = 2;
        double[] b ={1,2};
        double[] c ={1,2,6};

        double[][] e = {{1,2,3},
                        {4,5,6},
                        {8,9,3}};

        double[][] f = {{66,55,44},
                        {34,34},
                        {14,44444,43}};

        double[][] g = {{1,2,3},
                        {4,5,6}};

        double[][] h = {{7,8},
                        {9, 10}};

        calc.calculate(7, 2);
    }
}
