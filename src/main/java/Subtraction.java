public class Subtraction implements Operations {

    private Double result;

    public Subtraction() {

    }

    public Subtraction(Double result) {
        this.result = result;
    }

    public Subtraction(String message) {
    }

    @Override
    public Object data(double a, double b) {
        result = a-b;
        return new Subtraction(result);
    }

    @Override
    public Object data(double a, double[] b) {
        return null;
    }

    @Override
    public Object data(double a, double[][] b) {
        return null;
    }

    @Override
    public Object data(double[] a, double[] b) {
        return null;
    }

    @Override
    public Object data(double[][] a, double[][] b) {
        return null;
    }

    @Override
    public Object data(double[][] a, double[] b) {
        return null;
    }

    @Override
    public String toString() {
        if (result != null) {
            return "Wynik odejmowania: " + result;
        } else {
            return "Wynik odejmowania: " + message;
        }

    }
}
