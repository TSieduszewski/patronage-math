public class Adding implements Operations{

    private Double result;

    public Adding(Double result) {
        this.result = result;
    }

    public Adding(){

    }

    public Adding data(double a, double b) {
        result = a+b;
        return new Adding(result);
    }

    @Override
    public Adding data(double a, double[] b) {
        return null;
    }

    @Override
    public Adding data(double a, double[][] b) {
        return null;
    }

    public Adding data(double[] a, double[] b){
        return new Adding(result);
    }

    public Adding data(double[][] a, double[][] b){
        return new Adding(result);
    }

    @Override
    public Adding data(double[][] a, double[] b) {
        return null;
    }

    @Override
    public String toString() {
        return "Wynik dodawania: " + result;
    }
}
