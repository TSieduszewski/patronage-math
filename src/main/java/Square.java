public class Square implements Operations {

    private Result result;
    private String message = Operations.message;

    public Square() {
        result = new Result();
    }

    public Square(Result result) {
        this.result = result;
    }

    public Square(String message) {
        this.message = message;
    }

    @Override
    public Square data(double a, double b) {
        double[] temp = {Math.sqrt(a), Math.sqrt(b)};
        result.setVectorResult(temp);
            return new Square(result);
    }

    @Override
    public Square data(double a, double[] b) {
        return new Square(message);
    }

    @Override
    public Square data(double a, double[][] b) {
        return new Square(message);
    }

    @Override
    public Square data(double[] a, double[] b) {
        return new Square(message);
    }

    @Override
    public Square data(double[][] a, double[][] b) {
        return new Square(message);
    }

    @Override
    public Square data(double[][] a, double[] b) {
        return new Square(message);
    }

    @Override
    public String toString() {

        if (result != null) {
            return "Wyniki pierwiastkowania dla pierwszej liczby: " + result.getVectorResult()[0] + ", zaś dla drugiej liczby: "+ result.getVectorResult()[1];
        } else {
            return "Wynik pierwiastkowania: " + message;
        }
    }
}
