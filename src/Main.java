public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //losowsnie liczb do tablicy 6-cio elementowej
        /* tablica musi miec zdefiniowany rozmiar ktorego potem nie mozna zmienic
        w javie tablica moze przechowywac typy proste i zlozone

         */
        int tablica_liczb_losowych[] = new int[6];
        for (int i = 0; i < tablica_liczb_losowych.length; i++) {
            tablica_liczb_losowych[i]=(int)(Math.random()*100+1);//od 1 do 100
        }
        //wypisywanie talicy na ekranie
        System.out.println("Wylosowana tablica; ");
        for (int element:tablica_liczb_losowych) {
            //(typ nazwa:nazwakolekcjii)
            System.out.print(element+", ");
        }
    }

}