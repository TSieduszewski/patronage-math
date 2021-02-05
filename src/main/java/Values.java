public class Values {

    Object value;

    public Values(Double a) {
        this.value = a;

    }

    public Values(Double[] b) {

        this.value = b;

    }

    public Values(Double[][] c) {

        this.value = c;
    }

    public Object getValue() {

        return value;
    }

}
