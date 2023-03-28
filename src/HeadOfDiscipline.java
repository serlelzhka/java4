public class HeadOfDiscipline extends Teacher {

    private String cafedra;

    public HeadOfDiscipline(String name, int age, String discipline, String cafedra) {
        super(name, age, discipline);
        this.cafedra = cafedra;
    }

    @Override
    void doSomething() {
        System.out.println("Меня зовут " + name + " мне " + age + " лет я преподаю предмет: " + getDiscipline() + " и являюсь заведующим кафедры : " + cafedra);
    }
}
