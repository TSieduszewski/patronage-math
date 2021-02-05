import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteringMatrix implements EnteringData {

    Double[][] tempMatrix;
    Values insertedMatrix;

    @Override
    public void enterValue() {
        boolean isRowCorrect = false;
        boolean isColumnCorrect = false;
        int rows = 0;
        int column = 0;

        //podaj ilość rzędów
        System.out.println("Podaj ile rzędów ma mieć matryca");
        while (!isRowCorrect) {
            try {
                Scanner scan = new Scanner(System.in);
                rows = scan.nextInt();
                if (rows >= 1 && rows <= 4) {
                    isRowCorrect = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
            }
        }
        isRowCorrect = false;
        //podaj ilość kolumn
        System.out.println("Podaj ile kolumn ma mieć matryca");
        while (!isColumnCorrect) {
            try {
                Scanner scan = new Scanner(System.in);
                column = scan.nextInt();
                if (column >= 1 && column <= 4) {
                    isColumnCorrect = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
            }
        }
        isColumnCorrect = false;


        //podaj liczby w n-tym rzędzie (liczby umieszczane są w kolejności od lewej do prawej)
        tempMatrix = new Double[rows][column];

            for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < column; c++) {
                        try {
                            System.out.println("Wprowadź wartość na pozycji nr. " + (c + 1) + " w rzędzie nr. " + (r+1));
                            Scanner scan = new Scanner(System.in);
                            double temp = scan.nextDouble();
                            tempMatrix[r][c] = temp;

                        } catch (InputMismatchException e) {
                            System.out.println("Nieprawidłowy format danych. Spróbuj jeszcze raz");
                            c--;
                        }
                    }
            }

        insertedMatrix = new Values(tempMatrix);


    }

    @Override
    public Values getEnteredValue() {
        return insertedMatrix;
    }

    @Override
    public String whatIsPossible() {
        return "Możliwe operacje do wykonania: Dodawanie, Odejmowanie, Mnożenie\n" +
                "Pamiętaj, że dużo zależy od podania drugiej liczby(wektora lub liczby) do obliczeń!\n" +
                "Część obliczeń może zostać niewykonanych ponieważ na danym zestawie nie będzie to możliwe.";
    }
}
