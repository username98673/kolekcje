import com.sun.source.tree.WhileLoopTree;


import java.lang.reflect.Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //losowsnie liczb do tablicy 6-cio elementowej
        /* tablica musi miec zdefiniowany rozmiar ktorego potem nie mozna zmienic
        w javie tablica moze przechowywac typy proste i zlozone

         */
        int tablica_liczb_losowych[] = new int[6];
        for (int i = 0; i < tablica_liczb_losowych.length; i++) {
            tablica_liczb_losowych[i] = (int) (Math.random() * 100 + 1);//od 1 do 100
        }
        //wypisywanie talicy na ekranie
        System.out.println("Wylosowana tablica; ");
        for (int element : tablica_liczb_losowych) {
            //(typ nazwa:nazwakolekcjii)
            System.out.print(element + ", ");
        }

    /*kolekcje moga miec zmieniany rozmiar(dodawanie i usuwanie elementow)
    kolekcje jako elementy tylko typy zlozone (z duzej litery)
    list List - interfejs, ArrayList LinkedList
    zbiory Set - interfejs, HashSet
    mapy
     */

        //przygotu liste z liczbami pisanymi z klawiatury
        ArrayList<Integer> lista_liczb_z_klawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            lista_liczb_z_klawiatury.add(liczba);
        }
        //wpisz liczbe
        System.out.println("Wprowadzona tablica");
        for (int i = 0; i < lista_liczb_z_klawiatury.size(); i++) {
            System.out.println(lista_liczb_z_klawiatury.get(i));
        }
        System.out.println(lista_liczb_z_klawiatury);
        //losowanie list bez powtorzen
        ArrayList<Integer> lista_liczb_wylosowanych_bez_powtorzen=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba=(int)(Math.random()*100+1);
            while (lista_liczb_wylosowanych_bez_powtorzen.contains(liczba)){
                liczba=(int)(Math.random()*100+1);
            }
            lista_liczb_wylosowanych_bez_powtorzen.add(liczba);
        }
        System.out.println("Lista bez powtorzen");
        System.out.println(lista_liczb_wylosowanych_bez_powtorzen);
        //losowanie do zbioru
        HashSet<Integer> zbiorLosowychBezPowtorzen=new HashSet<>();
            while (lista_liczb_wylosowanych_bez_powtorzen.size() < 6);{
            int liczba = (int) (Math.random() * 100 + 1);
            zbiorLosowychBezPowtorzen.add(liczba);

        }
        System.out.println(zbiorLosowychBezPowtorzen);
        /*
        listy: uporzadkowane, indeksowane, moga powtarzac
        zbiory:zazwyczaj nieuporzadkowane nieindeksowane bez powtorzen
         */
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana:lista_liczb_z_klawiatury) {
            if (lista_liczb_wylosowanych_bez_powtorzen.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        System.out.println(trafione);
    }
}