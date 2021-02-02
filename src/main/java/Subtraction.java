public class Subtraction implements Operations {

    private Result result;
    private String message = Operations.message;

    public Subtraction() {
        result = new Result();
    }

    public Subtraction(Result result) {
        this.result = result;
    }

    public Subtraction(String message) {
        this.message = message;
    }

    @Override
    public Subtraction data(double a, double b) {
        result.setNumberResult(a - b);
        return new Subtraction(result);
    }

    @Override
    public Subtraction data(double a, double[] b) {
        return new Subtraction(message);
    }

    @Override
    public Subtraction data(double a, double[][] b) {
        return new Subtraction(message);
    }

    public Subtraction data(double[] a, double[] b) {
        double[] temp = new double[a.length];

        if (a.length != b.length) {
            return new Subtraction("Nie można odjąć wektorów, ponieważ są różnej długości");
        } else {
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i] - b[i];
            }
        }
        result.setVectorResult(temp);
        return new Subtraction(result);
    }

    public Subtraction data(double[][] a, double[][] b) {
        try{
            double[][] temp = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    temp[i][j] = a[i][j] - b[i][j];
                }
            }
            result.setMatrixResult(temp);
            return new Subtraction(result);
        } catch (ArrayIndexOutOfBoundsException e){
            return new Subtraction("Macierze są różnych wymiarów");
        }

    }

    @Override
    public Subtraction data(double[][] a, double[] b) {
        return new Subtraction(message);
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
