
import com.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BenutzerTest {
    @Test
    public void kalkuliereZeit(){
        Mannschaftssport b = new Basketball();
        Mannschaftssport f = new Fussball();
        Leichtathletik hi = new Hindernislauf();
        Leichtathletik ho = new Hochsprung();
        //Sport ma = new

        List<Sport> liste =new ArrayList();
        liste.add(b);
        liste.add(f);
        liste.add(hi);
        liste.add(ho);

        Benutzer benutzer = new Benutzer("ion","ian", liste);
        double rez = benutzer.kalkuliereZeit();
        assertEquals(170.0,rez);
    }

    @Test
    public void kalkuliereDurschnitt(){
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
        double rez = benutzer.kalkuliereDurschnittszeit();
        assertEquals(42.5,rez);
    }




}
