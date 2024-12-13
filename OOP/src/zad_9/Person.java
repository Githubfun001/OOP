package zad_9;

public record Person(String name, int age) {
    public Person(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0);
    }
}
