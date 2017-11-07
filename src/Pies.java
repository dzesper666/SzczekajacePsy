class Pies {
    String imie;
    public static void main (String[] args) {

        Pies pies1 = new Pies();
        pies1.szczekaj();
        pies1.imie = "Nabuhonozorek";

        Pies[] mojePsy = new Pies[4];

        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = new Pies();
        mojePsy[3] = pies1;

        mojePsy[0].imie = "Magnus";
        mojePsy[1].imie = "Andreas";
        mojePsy[2].imie = "Ramses";

        System.out.print("Ostatni pies ma na imię ");
        System.out.println(mojePsy[3].imie);

        int x = 0;
        while (x < mojePsy.length) {
            mojePsy[x].szczekaj();
            x = x + 1; }
    }

    public void szczekaj() {
        System.out.println(imie + " szczeka: Hau, hau!!");
    }
    public void jedz() { }
    public void gonKota() { }
}