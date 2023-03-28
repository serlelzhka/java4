import java.util.ArrayList;

public class EducationalInstitution {
    protected static final ArrayList<Person> persons = new ArrayList<Person>();

    public static void deleteSelectedPerson(String name) {
        for (Person person: persons) {
            if (person.getName() == null ? name == null : person.getName().equals(name)) {
                persons.remove(person);
                System.out.println("Успешно удалено!");
                return;
            }
        }
        System.out.println("Персоны с выбранным именем не существует!");
    }

    public static void doSelectedActivity(String name) {

        for (Person person: persons) {
            if (person.getName() == null ? name == null : person.getName().equals(name)) {
                person.doSomething();
                return;
            }
        }
        System.out.println("Персоны с выбранным именем не существует!");
    }

    public static void doAllActivities() {
        if (persons.isEmpty()) {
            System.out.println("Для этого добавьте хотя бы одну персону...");
            return;
        }
        System.out.println();
        for (Person person: persons) {
            person.doSomething();
        }
        System.out.println();
    }

    public static void getPersonsList() {
        System.out.println();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + " - " + persons.get(i).getName());
        }
        System.out.println();
    }
}
