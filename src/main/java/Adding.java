public class Adding implements Operations {

    private Double result;
    private String message = "Brak możliwości wykonania obliczeń dla podanych typów wartości";

    public Adding() {

    }

    public Adding(Double result) {
        this.result = result;
    }

    public Adding(String message) {
        this.message = message;
    }


    public Adding data(double a, double b) {
        result = a + b;
        return new Adding(result);
    }

    @Override
    public Adding data(double a, double[] b) {
        return new Adding(message);
    }

    @Override
    public Adding data(double a, double[][] b) {
        return new Adding(message);
    }

    public Adding data(double[] a, double[] b) {
        return new Adding(result);
    }

    public Adding data(double[][] a, double[][] b) {
        return new Adding(result);
    }

    @Override
    public Adding data(double[][] a, double[] b) {
        return new Adding(message);
    }

    @Override
    public String toString() {
        return "Wynik dodawania: " + result;
    }
}
