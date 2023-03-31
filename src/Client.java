public class Client {
    String name;
    String surname;
    int age;
    long pesel;

    int dodaj(int first, int second) {
        System.out.println("dostalem " + first);
        System.out.println("dostalem " + second);
        System.out.println(this.name);

        return first+second;
    }

    int dodaj(int first, int second, int third) {
        return first+second+third;
    }

    double dodaj(double first, double second) {
        return first+second;
    }

    double podziel(int first, int second) {
        return ((double) first) / ((double) second);
    }

    void powiedzSwojeImie() {
        if(age < 2) {
            return;
        }

        System.out.println(this.name);
    }

    int cos(int a, int b) {
        if(a > 10) {
            return a * b;
        }
        return a + 1;
    }

    /*class Address {
        class Cos {

        }
    }*/
}
