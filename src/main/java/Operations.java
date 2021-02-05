import java.math.BigDecimal;

public interface Operations<T> {

    String message = "Brak możliwości wykonania obliczeń dla podanych typów wartości";

    T data(Double a, Double b);

    T data(Double a, Double[] b);

    T data(Double a, Double[][] b);

    T data(Double[] a, Double[] b);

    T data(Double[][] a, Double[][] b);

    T data(Double[][] a, Double[] b);

}
