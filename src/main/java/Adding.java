import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Formatter;

public class Adding implements Operations {

    private Result result;
    private String message = Operations.message;

    public Adding() {
        result = new Result();
    }

    public Adding(Result result) {
        this.result = result;
    }

    public Adding(String message) {
        this.message = message;
    }

    @Override
    public Adding data(Double a, Double b) {
        result.setNumberResult(a + b);
        return new Adding(result);
    }

    @Override
    public Adding data(Double a, Double[] b) {
        return new Adding(message);
    }

    @Override
    public Adding data(Double a, Double[][] b) {
        return new Adding(message);
    }

    public Adding data(Double[] a, Double[] b) {
        Double[] temp = new Double[a.length];

        if (a.length != b.length) {
            return new Adding("Nie można dodać wektorów, ponieważ są różnej długości");
        } else {
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i] + b[i];
            }
        }
        result.setVectorResult(temp);
        return new Adding(result);
    }

    public Adding data(Double[][] a, Double[][] b) {
        try{
            Double[][] temp = new Double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    temp[i][j] = a[i][j] + b[i][j];
                }
            }
            result.setMatrixResult(temp);
            return new Adding(result);
        } catch (ArrayIndexOutOfBoundsException e){
            return new Adding("Macierze są różnych wymiarów");
        }

    }

    @Override
    public Adding data(Double[][] a, Double[] b) {
        return new Adding(message);
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("0.00");
        if (result != null) {
            return "Wynik dodawania: " + result;
        } else {
            return "Wynik dodawania: " + message;
        }
    }
}
