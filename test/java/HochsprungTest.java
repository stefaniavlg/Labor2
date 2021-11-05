import com.company.Hochsprung;
import com.company.Leichtathletik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HochsprungTest {
    @Test
    public void kalkuliereZeit(){
        Leichtathletik hochsprung = new Hochsprung();

        double result = hochsprung.kalkuliereZeit();
        assertEquals(20.0,result);
    }
}
