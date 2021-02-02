import java.math.BigDecimal;

public interface Operations<T> {

    String message = "Brak możliwości wykonania obliczeń dla podanych typów wartości";

    T data(double a, double b);

    T data(double a, double[] b);

    T data(double a, double[][] b);

    T data(double[] a, double[] b);

    T data(double[][] a, double[][] b);

    T data(double[][] a, double[] b);

}
