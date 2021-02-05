public class Calculator {

    Operations operation;
    boolean methodNotFounded = true;

    public Calculator() {

    }

    public void calculate(Values a, Values b) {


        if (a.getValue() instanceof Double && b.getValue() instanceof Double) {
            calculate((Double) a.getValue(), (Double) b.getValue());
            methodNotFounded = false;
        }
        if (a.getValue() instanceof Double && b.getValue() instanceof Double[]) {
            calculate((Double) a.getValue(), (Double[]) b.getValue());
            methodNotFounded = false;
        }
        if (a.getValue() instanceof Double && b.getValue() instanceof Double[][]) {
            calculate((Double) a.getValue(), (Double[][]) b.getValue());
            methodNotFounded = false;
        }
        if (a.getValue() instanceof Double[] && b.getValue() instanceof Double[]) {
            calculate((Double[]) a.getValue(), (Double[]) b.getValue());
            methodNotFounded = false;
        }
        if (a.getValue() instanceof Double[][] && b.getValue() instanceof Double[][]) {
            calculate((Double[][]) a.getValue(), (Double[][]) b.getValue());
            methodNotFounded = false;
        }
        if (a.getValue() instanceof Double[][] && b.getValue() instanceof Double[]) {
            calculate((Double[][]) a.getValue(), (Double[]) b.getValue());
            methodNotFounded = false;
        }
        if (methodNotFounded = true) {
            System.out.println("Nie można dokonać obliczeń dla tych wartości");
        }
    }


    private void calculate(Double a, Double b) {

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }

    private void calculate(Double a, Double[] b) {

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }

    private void calculate(Double a, Double[][] b) {
        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }

    private void calculate(Double[] a, Double[] b) {

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }

    private void calculate(Double[][] a, Double[][] b) {

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }

    private void calculate(Double[][] a, Double[] b) {

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        operation = new Subtraction();
        System.out.println(operation.data(a, b));

        //wykonaj mnożenie
        operation = new Multiplication();
        System.out.println(operation.data(a, b));

        //wykonaj dzielenie
        operation = new Divide();
        System.out.println(operation.data(a, b));

        //wykonaj potęgowanie
        operation = new Exponentiation();
        System.out.println(operation.data(a, b));

        //wykonaj pierwiastkowanie (2)
        operation = new Square();
        System.out.println(operation.data(a, b));
    }
}
