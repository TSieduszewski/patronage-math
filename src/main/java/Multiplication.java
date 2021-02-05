import java.util.Arrays;

public class Multiplication implements Operations {

    private Result result;
    private String message = Operations.message;

    public Multiplication() {
        result = new Result();
    }

    public Multiplication(Result result) {
        this.result = result;
    }

    public Multiplication(String message) {
        this.message = message;
    }

    @Override
    public Multiplication data(Double a, Double b) {
        result.setNumberResult(a * b);
        return new Multiplication(result);
    }

    @Override
    public Multiplication data(Double a, Double[] b) {
        Double[] temp = new Double[b.length];
        for (int i = 0; i < b.length; i++) {
            temp[i] = b[i] * a;
        }
        result.setVectorResult(temp);
        return new Multiplication(result);
    }

    @Override
    public Multiplication data(Double a, Double[][] b) {

        Double[][] temp = b;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if ((Double) b[i][j] != null) {
                    temp[i][j] = a * b[i][j];
                }

            }
        }
        result.setMatrixResult(temp);
        return new Multiplication(result);

    }

    public Multiplication data(Double[] a, Double[] b) {
        return new Multiplication(message);
    }

    public Multiplication data(Double[][] a, Double[][] b) {

        if (a[0].length == b.length) {
            try {
                Double[][] temp = new Double[a.length][b[0].length];
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < b[0].length; j++) {
                        for (int k = 0; k < b.length; k++) {
                            temp[i][j] += a[i][k] * b[k][j];
                        }

                    }
                }
                result.setMatrixResult(temp);
                return new Multiplication(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Multiplication("Macierze są nieprawidłowych rozmiarów");
            }
        } else {
            return new Multiplication("Macierze są nieprawidłowych rozmiarów (liczba kolumn pierwszej nie równa się liczbie wierszy drugiej)");
        }

    }

    @Override
    public Multiplication data(Double[][] a, Double[] b) {
        if (a.length == b.length) {
            try {
                Double[] temp = new Double[b.length];
                Arrays.fill(temp,0.0);
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < a[0].length; j++) {
                        temp[i] += a[i][j] * b[i];
                    }
                }
                result.setVectorResult(temp);
                return new Multiplication(result);

            } catch (ArrayIndexOutOfBoundsException e) {
                return new Multiplication("Macierze są nieprawidłowych rozmiarów");
            }
        } else {
            return new Multiplication("Macierz lub wektor jest nieprawidłowych rozmiarów (liczba kolumn macierzy nie równa się liczbie argumentów wektora)");
        }
    }

    @Override
    public String toString() {

        if (result != null) {
            return "Wynik mnożenia: " + result;
        } else {
            return "Wynik mnożenia: " + message;
        }
    }
}
