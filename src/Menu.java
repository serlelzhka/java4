import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        getMainMenu();
    }

    private static void getMainMenu() {
        boolean working = true;
        do {
            System.out.println("\n1 - Создать персону");
            System.out.println("2 - Посмотреть список персон");
            System.out.println("3 - Выполнить действия всех персон");
            System.out.println("4 - Выполнить действие конкретной персоны");
            System.out.println("5 - Удалить персону по имени");
            System.out.println("0 - Выход из программы\n");

            int choice = readChoice();

            String name;
            switch (choice) {
                case 1:
                    createPerson();
                    break;
                case 2:
                    EducationalInstitution.getPersonsList();
                    break;
                case 3:
                    EducationalInstitution.doAllActivities();
                    break;
                case 4:
                    System.out.print("Введите имя персоны, действие которой вы хотите посмотреть: ");
                    name = scanner.nextLine();
                    EducationalInstitution.doSelectedActivity(name);
                    break;
                case 5:
                    System.out.print("Введите имя персоны, которую вы хотите удалить: ");
                    name = scanner.nextLine();
                    EducationalInstitution.deleteSelectedPerson(name);
                    break;
                case 0:
                    working = false;
                    System.out.println("Выход из программы...");
            }
        } while (working);
    }

    private static void createPerson() {
        System.out.println("1 - Студент");
        System.out.println("2 - Преподаватель");
        System.out.println("3 - Завкафедры");
        System.out.print("Какую персону вы хотите создать: ");

        String name;
        int age;

        int choice = Menu.readChoice();
        switch (choice) {
            case 1:
                System.out.print("Введите имя студента: ");
                name = scanner.nextLine();
                System.out.print("Введите возраст студента: ");
                age = readChoice();
                System.out.print("Введите курс обучения: ");
                int course = readChoice();
                EducationalInstitution.persons.add(new Student(name, age, course));
                System.out.print("\nСтудент успешно создан\n");
                return;
            case 2:
                System.out.print("Введите имя преподавателя: ");
                name = scanner.nextLine();
                System.out.print("Введите возраст преподавателя: ");
                age = readChoice();
                System.out.print("Введите название предмета предователя: ");
                String discipline = scanner.nextLine();
                EducationalInstitution.persons.add(new Teacher(name, age, discipline));
                System.out.print("\nПреподаватель успешно создан\n");
                return;
            case 3:
                System.out.print("Введите имя завкафедры: ");
                name = scanner.nextLine();
                System.out.print("Введите возраст завкафедры: ");
                age = readChoice();
                System.out.print("Введите название предмета завкафедры: ");
                String subject = scanner.nextLine();
                System.out.print("Введите название кафедры, которйо он заведует: ");
                String object = scanner.nextLine();
                EducationalInstitution.persons.add(new HeadOfDiscipline(name, age, subject, object));
                System.out.print("\nЗавкафедрой успешно создан\n");
                return;
            default:
                createPerson();
        }
    }

    private static int readChoice() {
        Scanner in = new Scanner(System.in);
        int readed;
        try {
            readed = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка! Допустим только ввод значений пунктов меню");
            readed = readChoice();
        }
        return readed;
    }
}