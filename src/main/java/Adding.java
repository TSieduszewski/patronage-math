public class Adding implements Operations {

    private Double result;

    public Adding() {

    }

    public Adding(Double result) {
        this.result = result;
    }

    public Adding(String message) {
    }

    @Override
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
        if (result != null) {
            return "Wynik dodawania: " + result;
        } else {
            return "Wynik dodawania: " + message;
        }

    }
}
