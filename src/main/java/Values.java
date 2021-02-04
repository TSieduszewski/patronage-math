public class Values {

    Object value;

    public Values(double a) {
        this.value = a;

    }

    public Values(Double[] b) {

        this.value = b;

    }

    public Values(double[][] c) {

        this.value = c;
    }

    public Object getValue() {

        return value;
    }

}
