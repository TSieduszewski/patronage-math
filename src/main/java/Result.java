import java.util.Arrays;

public class Result {

    private Double numberResult;
    private double[] vectorResult;
    private double[][] matrixResult;

    public Double getNumberResult() {
        return numberResult;
    }

    public void setNumberResult(Double numberResult) {
        this.numberResult = numberResult;
    }

    public double[] getVectorResult() {
        return vectorResult;
    }

    public void setVectorResult(double[] vectorResult) {
        this.vectorResult = vectorResult;
    }

    public double[][] getMatrixResult() {
        return matrixResult;
    }

    public void setMatrixResult(double[][] matrixResult) {
        this.matrixResult = matrixResult;
    }

    @Override
    public String toString() {
        if (numberResult != null) {
            return "" + numberResult;
        }

        if (vectorResult != null) {
            return "" + Arrays.toString(vectorResult);
        }

        if (matrixResult != null) {

           return "" + Arrays.deepToString(matrixResult);
        }
        return "";
    }
}
