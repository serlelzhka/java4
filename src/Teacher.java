public class Teacher extends Person {

    private String discipline;

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    void doSomething() {
        System.out.println("Меня зовут " + name + " мне " + age + " лет, я предодаю предмет: " + discipline);
    }
}
