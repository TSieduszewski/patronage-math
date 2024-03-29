import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Values> allValues = new ArrayList<>();
        Menu menu = new Menu();

        System.out.println("Witaj w kalkulatorze matematycznym");

        System.out.println("Operacje możliwe do wykonania to dodawanie, odejmowanie,\n" +
                "odejmowanie, mnożenie, dzielenie, potęgowanie(tylko w zakresie 0-128), pierwiastkowanie (kwadratowe)\n" +
                "liczb, wektorów i macierzy. Uwaga, nie każde działanie da się wykonać na podawanych typach danych.\n");

        while (menu.getEnd()) {
            InsertedValues insertedValues = new InsertedValues();
            for (int i = 0; i < 2; i++) {
                menu.options();
                insertedValues.execute(menu.getOption(), i);
                allValues.add(insertedValues.getExecutedData());
                if (i == 0) {
                    System.out.println("Druga wartość:");
                }
            }

            Calculator c = new Calculator();
            c.calculate(allValues.get(0), allValues.get(1));
            System.out.println("------------------------------------------------------");
            menu.end();
        }


    }

}




