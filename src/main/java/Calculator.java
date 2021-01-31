public class Calculator {

    Operations operation;

    public Calculator(){

    }
    public void calculate(double a, double b){

        //wykonaj dodawanie
        operation = new Adding();
        System.out.println(operation.data(a, b));

        //wykonaj odejmowanie
        System.out.println("Wynik odejmowania: " );

        //wykonaj mnożenie
        System.out.println("Wynik mnożenia: " );

        //wykonaj dzielenie
        if(b==0){
            System.out.println("Wynik dzielenia: pamiętaj cholero, nie ma dzielenia przez zero!");
        } else {
            System.out.println("Wynik dzielenia: " );
        }

        //wykonaj potęgowanie
        System.out.println("Wynik potęgowania: " );
            //sprawdź, czy druga liczba jest większa od 0 i mniejsza od 128 i jeśli nie
            // to jeśli jest mniejsza to przyjmij 0 a jeśli większa to 128

        //wykonaj pierwiastkowanie (2)
        System.out.println("Wynik pierwiastkowania: " );
    }

    public void calculate(double a, double[] b){

    }

    public void calculate(double a, double[][] b){

    }

    public void calculate(double[] a, double[] b){

    }

    public void calculate(double[][] a, double[][] b){

    }

    public void calculate(double[] a, double[][] b){

    }
}
