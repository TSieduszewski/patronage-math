public class Divide implements Operations {

    private Result result;
    private String message = Operations.message;

    public Divide() {
        result = new Result();
    }

    public Divide(Result result) {
        this.result = result;
    }

    public Divide(String message) {
        this.message = message;
    }

    @Override
    public Divide data(double a, double b) {

        Double temp = a / b;
        if (temp.isInfinite()) {
            return new Divide("Nie ma dzielenia przez zero");
        } else{
            result.setNumberResult(temp);
            return new Divide(result);
        }

    }

    @Override
    public Divide data(double a, double[] b) {
        return new Divide(message);
    }

    @Override
    public Divide data(double a, double[][] b) {
        return new Divide(message);
    }

    @Override
    public Divide data(double[] a, double[] b) {
        return new Divide(message);
    }

    @Override
    public Divide data(double[][] a, double[][] b) {
        return new Divide(message);
    }

    @Override
    public Divide data(double[][] a, double[] b) {
        return new Divide(message);
    }

    @Override
    public String toString() {

        if (result != null) {
            return "Wynik dzielenia: " + result;
        } else {
            return "Wynik dzielenia: " + message;
        }
    }
}
