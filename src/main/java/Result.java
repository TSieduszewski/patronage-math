import java.math.BigDecimal;
import java.util.Arrays;

public class Result {

    private Double numberResult;
    private Double[] vectorResult;
    private Double[][] matrixResult;

    public Double getNumberResult() {
        return numberResult;
    }

    public void setNumberResult(Double numberResult) {
        this.numberResult = numberResult;
    }

    public Double[] getVectorResult() {
        return vectorResult;
    }

    public void setVectorResult(Double[] vectorResult) {
        this.vectorResult = vectorResult;
    }

    public Double[][] getMatrixResult() {
        return matrixResult;
    }

    public void setMatrixResult(Double[][] matrixResult) {
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
