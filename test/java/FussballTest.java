import com.company.Fussball;
import com.company.Mannschaftssport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FussballTest {
    @Test
    public void kalkuliereZeit(){
        Mannschaftssport f = new Fussball();

        double rez = f.kalkuliereZeit();
        assertEquals(65.0,rez);
    }
}
