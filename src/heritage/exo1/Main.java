package heritage.exo1;

public class Main {
    public static void test() {
        // 1. Créer une personne
        Person person = new Person("John Doe", "123 Main St");
        // 2. Créer un étudiant
        Student student = new Student("Jane Doe", "456 Liberty St", "Web Development", 2, 15000.00);
        // 3. Créer un Staff
        Staff staff = new Staff("Jack Doe", "789 Church Bd", "Software Engineering", 50000.00);

        // 4. Afficher leurs informations
        System.out.println("Création d'une nouvelle personne : " + person);
        System.out.println("Création d'un nouvel étudiant : " + student);
        System.out.println("Création d'un nouveau membre du personnel : " + staff);
    }
}