
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zestaw10 {
    public static void main(String[] args) {
        var student = new Student("tomek",3.4,12);
        var student2 = new Student("romek",3.2,11);
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(student);
        studenci.add(student2);
        studenci.add(student2);

        studenci.sort(null);
        System.out.println(studenci);

        Car car1 = new Car("audi",456,123);
        Car car2 = new Car("lambo",67,1233);
        Car car3 = new Car("porshe",1,1234);
        Car car4 = new Car("bugatti",218,1235);

        Car[] tablica = {car1,car2,car3,car4};
        Arrays.sort(tablica);
        for(var i:tablica){
            System.out.println(i);
        }
        /*
        Dog dog = new Dog();
        dog.makeHappySound();
        dog.makeSound();
        */
        //zad11
        Student2[] studentTest ={
                new Student2("a",3.14,2),
                new Student2("b", 2.12,1),
                new Student2("d",3.14,1),
                new Student2("c",3.14,3)
        };
        Arrays.sort(studentTest);
        for(var i: studentTest){
            System.out.println(i);
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Smith", "Manager"));
        employees.add(new Employee("Alice", "Johnson", "Developer"));
        employees.add(new Employee("Bob", "Lee", "Designer"));
        employees.add(new Employee("Charlie", "Davis", "Analyst"));

        Collections.sort(employees);
        System.out.println(employees);

        //zad 22
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Cat", 5));
        animalList.add(new Animal("Elephant", 10));
        animalList.add(new Dog("Dog", 3, "Bulldog"));
        animalList.add(new Dog("Dog", 3, "Labrador"));
        animalList.add(new Dog("Dog", 5, "Poodle"));

        Collections.sort(animalList);

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }

}
//zad1
class Student implements Comparable<Student>
{
    public String name;
    public double averageGrade;
    public int yearOfBirth;

    Student(String name, double averageGrade, int yearOfBirth)
    {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }
    //porownanie po stringach
    /*
    @Override
    public int compareTo(MyString o) {
        return value.compareTo(o.value);
    }
    @Override
    public int compareTo(MyString o) {
        return this.value.compareToIgnoreCase(o.value);
    }
    */


    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageGrade, other.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
//zad7
class Car implements Comparable<Car>{
    public String name;
    public int mileage;
    public int yearOfProduction;

    public Car(String name, int mileage, int yearOfProduction) {
        this.name = name;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        if(this.mileage < o.mileage) return -1;
        if(this.mileage > o.mileage) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
//zad11
/*interface AnimalSound{
    void makeSound();
}
interface DomesticAnimalSound extends AnimalSound{
    void makeHappySound();
}
class Dog implements DomesticAnimalSound{

    @Override
    public void makeHappySound() {
        System.out.println("Wag tail");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}*/
class Student2 implements Comparable<Student2>{
    public String name;
    public double averageGrade;
    public int yearOfStudy;

    public Student2(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public int compareTo(Student2 o) {
        int porownanieDoubli = Double.compare(o.averageGrade, this.averageGrade);
        if(porownanieDoubli == 0)
            return Integer.compare(this.yearOfStudy, o.yearOfStudy);
        return porownanieDoubli;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', averageGrade=" + averageGrade + ", yearOfStudy=" + yearOfStudy + "}";
    }
}
//zad12
class Order implements Comparable<Order>{
    public String name;
    public int quantity;
    public double unitPrice;

    public Order(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    @Override
    public int compareTo(Order o) {
        int porownanie = Double.compare(o.unitPrice, this.unitPrice);
        if(porownanie == 0) return (Integer.compare(this.quantity, o.quantity));
        return porownanie;
    }
}
class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }


    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.lastName.length(), o.lastName.length());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

}
//zad 22
class Animal implements Comparable<Animal> {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        int ageComparison = Integer.compare(this.age, other.age);
        if (ageComparison == 0) {
            return this.species.compareTo(other.species);
        }
        return ageComparison;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "', age=" + age + "}";
    }
}
class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public int compareTo(Animal other) {
        if (other instanceof Dog) {
            int comparison = super.compareTo(other);
            if (comparison == 0) {
                return this.breed.compareTo(((Dog) other).breed);
            }
            return comparison;
        }

        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return "Dog{species='" + getSpecies() + "', age=" + getAge() + ", breed='" + breed + "'}";
    }
}



import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T objekt;
    public void setObjekt(T objekt){
        this.objekt = objekt;
    }
    public T getObjekt(){
        return objekt;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(objekt, box.objekt);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(objekt);
    }*/
}
class Counter<T>{
    List<T> lista =  new ArrayList<>();
    public void add(T element){
        lista.add(element);
    }
    public int getCount(){
        return lista.size();
    }
}

//zad 21
class Animal implements Comparable<Animal>{
    public int wiek;

    public Animal(int wiek) {
        this.wiek = wiek;
    }
    @Override
    public int compareTo(Animal other){
        return wiek - other.wiek;
    }
}
class Dog extends Animal{
    public Dog(int wiek) {
        super(wiek);
    }
}

class Animal1{

}
class Dog1 extends Animal1{
    private int age;
    public Dog1(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Pair<T>{
    T min;
    T max;
}




public class Zestaw11 {
    public static <T> boolean isEqual(T objekt1, T objekt2){
        return objekt1.equals(objekt2);
    }
    // zad 12
    public static <T> void swap(T[] tablica, int first, int second){
        if(first<0||second>tablica.length-1)    return;
        T temp;
        temp = tablica[first];
        tablica[first] = tablica[second];
        tablica[second] = temp;
    }
    //zad 14
    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    // zad21
    public static <T extends Animal> T findMax(T element1,T element2){
        return element1.compareTo(element2) > 0 ? element1 : element2;
    }
    // zad 23
    /*public static <T extends Animal1> T findMax2(T element1, T element2) {
        // Jeśli element1 jest instancją Dog, porównujemy na podstawie wieku
        if (element1 instanceof Dog1 && element2 instanceof Dog1) {
            Dog1 dog1 = (Dog1) element1;
            Dog1 dog2 = (Dog1) element2;
            return dog1.getAge() > dog2.getAge() ? dog1 : dog2;
        }
        // Jeśli chcielibyśmy porównywać inne typy zwierząt (np. Cat), dodajemy odpowiednią logikę
        // W tym przykładzie zakładamy, że tylko psy są porównywane, ale można rozszerzyć to o inne klasy.
        return null;
    }*/


    // zad28
    public static <T> void findMinMax(Dog1[] tab, Pair<?super Dog1> result){

        result.min = tab[0];
        result.max = tab[0];
        int min = tab[0].getAge();
        int maks = tab[0].getAge();
        for(int i=1;i<tab.length;i++){
            if(tab[i].getAge() < min) {
                result.min = tab[i];
                min = tab[i].getAge();
            }
            if(tab[i].getAge() > maks) {
                result.max = tab[i];
                maks = tab[i].getAge();
            }
        }

    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setObjekt("Objekt 1");
        System.out.println(box1.getObjekt());

        Box<Integer> box2 = new Box<>();
        box2.setObjekt(2);
        System.out.println(box2.getObjekt());

        Box<Integer> box3 = new Box<>();
        box3.setObjekt(2);
//        System.out.println(box3.getObjekt());

        System.out.println(isEqual(box3.getObjekt(), box2.getObjekt()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Jablko");
        stringCounter.add("gruszka");
        System.out.println(stringCounter.getCount());

        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(2);
        integerCounter.add(3);
        System.out.println(integerCounter.getCount());


        Animal animal = new Animal(3);
        Dog dog = new Dog(2);
        System.out.println(findMax(animal, dog));

        dog.wiek = 4;
        System.out.println(findMax(animal, dog));

        Dog1 dog1 = new Dog1(3);
        Dog1 dog2 = new Dog1(5);
        Dog1 dog3 = new Dog1(4);


        Dog1[] tab = {dog1, dog2, dog3};
        Pair<Dog1> para = new Pair<>();
        //28
        findMinMax(tab, para);
        System.out.println("maks " + para.max.getAge());
        System.out.println("min " + para.min.getAge());

    }
}
