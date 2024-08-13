import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Veuillez choisir une catégorie :");
            System.out.println("1. Concepts de base");
            System.out.println("0. Quitter");

            int categoryChoice = scanner.nextInt();

            if (categoryChoice == 0) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.println("Veuillez entrer un numéro d'exercice : ");
            int exerciseChoice = getIntInput(scanner);

            switch (categoryChoice) {
                case 1:
                    handleConceptsBase(scanner, exerciseChoice);
                    break;
                default:
                    System.out.println("Numéro de catégorie invalide.");
            }
        }
    }

    private int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un numéro.");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private void handleConceptsBase(Scanner scanner, int exerciseChoice) {
        switch (exerciseChoice) {
            case 1:
                conceptsbase.exo1.TestCompte.testCompte();
                break;
            case 2:
                conceptsbase.exo2.Execution.execute();
                break;
            case 3:
                conceptsbase.exo3.TestRectangle.execute();
                break;
            case 4:
                conceptsbase.exo4.geometry.TestCercle.execute();
                break;
            default:
                System.out.println("Numéro d'exercice invalide.");
        }
    }
}
