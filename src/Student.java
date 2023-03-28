public class Student extends Person {

    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void doSomething() {
        System.out.println("Меня зовут " + name + " мне " + age + " лет я учусь на " + course + " курсе!");
    }
}