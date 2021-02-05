import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteringNumbers implements EnteringData {

    Double tempValue;
    Values insertedValue;

    @Override
    public void enterValue() {
        boolean isCorrect = false;

        System.out.println("Wprowadź liczbę we właściwym formacie np. 1 albo 1.5");

        while (!isCorrect) {
            try {
                Scanner scan = new Scanner(System.in);
                tempValue = scan.nextDouble();
                isCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
            }
        }
        insertedValue=new Values(tempValue);
    }

    @Override
    public String whatIsPossible() {
        return "Możliwe operacje do wykonania: Dodawanie, Odejmowanie, \n" +
                "Mnożenie, Dzielenie, Potęgowanie, Pierwiastkowanie\n" +
                "Pamiętaj, że dużo zależy od podania drugiej liczby(wektora lub macierzy) do obliczeń!\n" +
                "Część obliczeń może zostać niewykonanych ponieważ na danym zestawie nie będzie to możliwe.";
    }

    public Values getEnteredValue(){
        return insertedValue;
    }
}
