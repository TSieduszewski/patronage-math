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
    public Multiplication data(double a, double b) {
        result.setNumberResult(a * b);
        return new Multiplication(result);
    }

    @Override
    public Multiplication data(double a, double[] b) {
        double[] temp = new double[b.length];
        for (int i = 0; i < b.length; i++) {
            temp[i] = b[i] * a;
        }
        result.setVectorResult(temp);
        return new Multiplication(result);
    }

    @Override
    public Multiplication data(double a, double[][] b) {

        double[][] temp = b;

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

    public Multiplication data(double[] a, double[] b) {
        return new Multiplication(message);
    }

    public Multiplication data(double[][] a, double[][] b) {


//        double[][] temp = new double[a.length][a[0].length];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                temp[i][j] = a[i][j] - b[i][j];
//            }
//        }
//        result.setMatrixResult(temp);
        return new Multiplication(result);
    }

    @Override
    public Multiplication data(double[][] a, double[] b) {
        return new Multiplication(message);
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
