package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mannschaftssport b = new Basketball();
        Mannschaftssport f = new Fussball();
        Leichtathletik hi = new Hindernislauf();
        Leichtathletik ho = new Hochsprung();


        List<Sport> liste =new ArrayList();
        liste.add(b);
        liste.add(f);
        liste.add(hi);
        liste.add(ho);

        Benutzer benutzer = new Benutzer("ion","ian", liste);
        System.out.println(benutzer.kalkuliereZeit());
        System.out.println(benutzer.kalkuliereZeit(hi));
        System.out.println(benutzer.kalkuliereDurschnittszeit());


    }
}
