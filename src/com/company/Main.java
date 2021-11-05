package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mannschaftssport basket = new Basketball();
        Mannschaftssport fuss = new Fussball();
        Leichtathletik hindernislauf = new Hindernislauf();
        Leichtathletik hochsprung = new Hochsprung();


        List<Sport> liste =new ArrayList();
        liste.add(basket);
        liste.add(fuss);
        liste.add(hindernislauf);
        liste.add(hochsprung);

        Benutzer benutzer = new Benutzer("ion","ian", liste);
        System.out.println(benutzer.kalkuliereZeit());
        System.out.println(benutzer.kalkuliereZeit(hindernislauf));
        System.out.println(benutzer.kalkuliereDurschnittszeit());


    }
}
