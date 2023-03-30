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

    }
}
