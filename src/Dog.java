public class Dog {
    String name;
    String race;
    int age;

    Dog(String name, String race, int age) {
        this(name, age);
        System.out.println("Wlasnie stworzyl sie obiekt psa !!!");
        this.race = race;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog() {

    }
}
