import java.util.Scanner;

public class Menu {

    private int selection;
    private boolean endingSelection=true;
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
        isSelected = false;
    }

    public void end() {

        while (!isSelected) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Jeszcze raz (r), czy zakończyć(q)");
            String temp = scanner.nextLine();
            switch (temp) {
                case "r":
                    isSelected = true;
                    break;
                case "q":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niepoprawne wartości. Spróbuj jeszcze raz");
            }
        }
        isSelected = false;
    }

    public int getOption() {
        return selection;
    }

    public boolean getEnd() {
        return endingSelection;
    }
}
