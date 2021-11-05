
import com.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BenutzerTest {
    @Test
    public void kalkuliereZeit(){
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
        double result = benutzer.kalkuliereZeit();
        assertEquals(170.0,result);
    }

    @Test
    public void kalkuliereDurschnitt(){
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
        double result = benutzer.kalkuliereDurschnittszeit();
        assertEquals(42.5,result);
    }




}
