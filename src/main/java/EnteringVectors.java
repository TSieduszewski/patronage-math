import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteringVectors implements EnteringData {

    Double[] tempValue;
    Values insertedValue;
    @Override
    public void enterValue() {
        boolean isCorrect = false;
        int vectorsLong = 0;

        System.out.println("Podaj długość wektora (minimum 2 maksimum 4");
        while (!isCorrect) {
            try {
                Scanner scan = new Scanner(System.in);
                vectorsLong = scan.nextInt();
                if (vectorsLong >= 2 && vectorsLong <= 4) {
                    isCorrect = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
            }
        }
        isCorrect = false;
        tempValue = new Double[vectorsLong];
        while (!isCorrect) {
            for (int i = 0; i < vectorsLong; i++) {
                try {
                        System.out.println("Wprowadź wartość nr. " + (i + 1));
                        Scanner scan = new Scanner(System.in);
                        double temp = scan.nextDouble();
                        tempValue[i] = temp;

                } catch (InputMismatchException e) {
                    System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
                    i--;
                }
            }
            isCorrect = true;
        }
        insertedValue = new Values(tempValue);
    }

    @Override
    public String whatIsPossible() {
        return "Możliwe operacje do wykonania: Dodawanie, Odejmowanie, \n" +
                "Pamiętaj, że dużo zależy od podania drugiej liczby(wektora lub macierzy) do obliczeń!\n" +
                "Część obliczeń może zostać niewykonanych ponieważ na danym zestawie nie będzie to możliwe.";
    }

    public Values getEnteredValue(){
        return insertedValue;
    }
}
