package heritage.exo1;

public class Main {
    public static void main(String[] args) {
        // 1. Créer une personne
        Person person = new Person("John Doe", "123 Main St");
        // 2. Créer un étudiant
        Student student = new Student("Jane Doe", "456 Liberty St", "Web Development", 2, 15000.00);
        // 3. Créer un Staff
        Staff staff = new Staff("Jack Doe", "789 Church Bd", "Software Engineering", 50000.00);

        // 4. Afficher leur information
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}