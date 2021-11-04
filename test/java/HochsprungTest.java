import com.company.Hochsprung;
import com.company.Leichtathletik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HochsprungTest {
    @Test
    public void kalkuliereZeit(){
        Leichtathletik h = new Hochsprung();

        double rez = h.kalkuliereZeit();
        assertEquals(20.0,rez);
    }
}
