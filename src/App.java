import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client[] tab = new Client[10];
        System.out.println(tab[0]);

        String[] names = new String[10];
        String[] surnames = new String[10];
        int[] ages = new int[10];
        long[] pesels = new long[10];

        int[] tab2 = new int[10];

        Client panJanusz;
        panJanusz = new Client();
        panJanusz.name = "Janusz";
        panJanusz.surname = "Kowalski";
        panJanusz.age = 30;
        panJanusz.pesel = 123123123;

        System.out.println(panJanusz.name);
        System.out.println(panJanusz.surname);

        Client panZbyszek = new Client();
        panZbyszek.name = "Zbigniew";
        panZbyszek.surname = "Malinowski";
        panZbyszek.age = 50;
        panZbyszek.pesel = 43564564;
        System.out.println(panZbyszek.name);
        System.out.println(panZbyszek.surname);

        tab[0] = new Client();
        tab[1] = panJanusz;
        tab[2] = panZbyszek;
        tab[3] = new Client();
        tab[3].name = "Bogdan";
        tab[3].surname = "Rodowicz";
        tab[3].age = 60;
        tab[3].pesel = 234523;
        //tab[4].name = "Wiesiek";

        int i = 7;
        Client c = new Client();

        System.out.println(i);
        System.out.println(c);
        System.out.println(tab[7]);

        Random losowacz = new Random();
        int x = losowacz.nextInt(1001);

        int suma = panZbyszek.dodaj(4, 8);
        int suma2 = panJanusz.dodaj(5, 10);
        int suma3 = panJanusz.dodaj(12, 40);
        int suma4 = panJanusz.dodaj(1,2,3);
        double suma5 = panJanusz.dodaj(4.4, 5.5);

        double wynik = panJanusz.podziel(5, 8);
        System.out.println(wynik);

        System.out.println(panJanusz.podziel(10, 3));



        Client client1 = new Client();
        Client client2 = client1;

        client1.name = "Janusz";

        System.out.println(client1.name);
        System.out.println(client2.name);

        client1.name = "Wiesiek";

        System.out.println(client1.name);
        System.out.println(client2.name);

        panJanusz.powiedzSwojeImie();
        panZbyszek.powiedzSwojeImie();
    }
}
