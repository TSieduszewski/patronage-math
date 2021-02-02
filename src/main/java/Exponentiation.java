public class Exponentiation implements Operations {

    private Result result;
    private String message = Operations.message;

    public Exponentiation() {
        result = new Result();
    }

    public Exponentiation(Result result) {
        this.result = result;
    }

    public Exponentiation(String message) {
        this.message = message;
    }

    @Override
    public Object data(double a, double b) {

        if (b<0 || b>128) {
            return new Exponentiation("Wykładnik potęgi nie mieści się w zakresie 0-128");
        } else{
            result.setNumberResult(Math.pow(a,b));
            return new Exponentiation(result);
        }

    }

    @Override
    public Object data(double a, double[] b) {
        return new Exponentiation(message);
    }

    @Override
    public Object data(double a, double[][] b) {
        return new Exponentiation(message);
    }

    @Override
    public Object data(double[] a, double[] b) {
        return new Exponentiation(message);
    }

    @Override
    public Object data(double[][] a, double[][] b) {
        return new Exponentiation(message);
    }

    @Override
    public Object data(double[][] a, double[] b) {
        return new Exponentiation(message);
    }

    @Override
    public String toString() {

        if (result != null) {
            return "Wynik potęgowania: " + result;
        } else {
            return "Wynik potęgowania: " + message;
        }
    }
}
