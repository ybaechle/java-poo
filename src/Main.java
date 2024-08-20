import java.util.Scanner;

public class Main {
    // Codes ANSI pour les couleurs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int categoryChoice = getCategoryChoice(scanner);

            if (categoryChoice == 0) {
                System.out.println(ANSI_GREEN + "Au revoir !" + ANSI_RESET);
                break;
            }

            int exerciseChoice = -1;
            if (categoryChoice != 2 && categoryChoice != 4) {
                exerciseChoice = getExerciseChoice(scanner, categoryChoice);
            }

            switch (categoryChoice) {
                case 1:
                    handleConceptsBase(scanner, exerciseChoice);
                    break;
                case 2:
                    handleEncapsulation(scanner);
                    break;
                case 3:
                    handleInheritance(scanner, exerciseChoice);
                    break;
                case 4:
                    displayAsciiArt();
                    break;
                default:
                    System.out.println(ANSI_RED + "Numéro de catégorie invalide." + ANSI_RESET);
            }
        }
    }

    private int getCategoryChoice(Scanner scanner) {
        int categoryChoice;
        while (true) {
            System.out.println(ANSI_CYAN + "\nVeuillez choisir une catégorie :" + ANSI_RESET);
            System.out.println("1. Concepts de base");
            System.out.println("2. Encapsulation");
            System.out.println("3. Heritage");
            System.out.println("4. ???");
            System.out.println("0. Quitter");

            categoryChoice = getIntInput(scanner);

            if (categoryChoice >= 0 && categoryChoice <= 4) {
                break;
            } else {
                System.out.println(ANSI_RED + "Numéro de catégorie invalide. Veuillez choisir un numéro valide." + ANSI_RESET);
            }
        }
        return categoryChoice;
    }

    private int getExerciseChoice(Scanner scanner, int categoryChoice) {
        int exerciseChoice;
        while (true) {
            switch (categoryChoice) {
                case 1:
                    System.out.println("Veuillez entrer un numéro d'exercice entre 1 et 4 : ");
                    break;
                case 3:
                    System.out.println("Veuillez entrer un numéro d'exercice entre 1 et 2 : ");
                    break;
            }

            exerciseChoice = getIntInput(scanner);

            if ((categoryChoice == 1 && exerciseChoice >= 1 && exerciseChoice <= 4) ||
                    (categoryChoice == 3 && exerciseChoice >= 1 && exerciseChoice <= 2)) {
                break;
            } else {
                System.out.println(ANSI_RED + "Numéro d'exercice invalide. Veuillez entrer un numéro valide." + ANSI_RESET);
            }
        }
        return exerciseChoice;
    }

    private int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println(ANSI_RED + "Entrée invalide. Veuillez entrer un numéro." + ANSI_RESET);
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private void handleConceptsBase(Scanner scanner, int exerciseChoice) {
        switch (exerciseChoice) {
            case 1:
                conceptsbase.exo1.TestCompte.test();
                break;
            case 2:
                conceptsbase.exo2.Execution.test();
                break;
            case 3:
                conceptsbase.exo3.TestRectangle.test();
                break;
            case 4:
                conceptsbase.exo4.geometry.TestCercle.test();
                break;
            default:
                System.out.println(ANSI_RED + "Numéro d'exercice invalide." + ANSI_RESET);
        }
    }

    private void handleEncapsulation(Scanner scanner) {
        encapsulation.exo1.Livre.main(null);
    }

    private void handleInheritance(Scanner scanner, int exerciseChoice) {
        switch (exerciseChoice) {
            case 1:
                heritage.exo1.Main.test();
                break;
            case 2:
                heritage.exo2.Main.test();
                break;
            default:
                System.out.println(ANSI_RED + "Numéro d'exercice invalide." + ANSI_RESET);
        }
    }

    private void displayAsciiArt() {
        System.out.println(ANSI_PURPLE +
                "    ***\n" +
                "  ** **\n" +
                " **   **\n" +
                " **   **         ****\n" +
                " **   **       **   ****\n" +
                " **  **       *   **   **\n" +
                "  **  *      *  **  ***  **\n" +
                "   **  *    *  **     **  *\n" +
                "    ** **  ** **        **\n" +
                "    **   **  **\n" +
                "   *           *\n" +
                "  *             *\n" +
                " *    0     0    *\n" +
                " *   /   @   \\   *\n" +
                " *   \\__/ \\__/   *\n" +
                "   *     W     *\n" +
                "     **     **\n" +
                "       *****\n" +
                ANSI_RESET);
        System.out.println("\nBravo ! Vous avez découvert un easter egg.");
    }


}
