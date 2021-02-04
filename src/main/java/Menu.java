import java.util.Scanner;

public class Menu {

    private int selection;
    private boolean isSelected = false;

    public Menu() {
    }

    public void options() {

        while (!isSelected) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Podaj co chcesz wprowadzić: (1) liczbę, (2) wektor, (3) macierz");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                    case 3:
                    case 2:
                        isSelected = true;
                        break;
                    default:
                        System.out.println("Podaj liczbę z zakresu 1-3");
                }

            } catch (Exception e) {
                System.out.println("Podaj liczbę z zakresu 1-3");
            }
        }
        isSelected=false;
    }

    public int getOption() {
        return selection;
    }
}
