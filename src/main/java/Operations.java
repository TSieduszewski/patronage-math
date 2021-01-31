public interface Operations<T> {

    T data(double a, double b);

    T data(double a, double[] b);

    T data(double a, double[][] b);

    T data(double[] a, double[] b);

    T data(double[][] a, double[][] b);

    T data(double[][] a, double[] b);

}
