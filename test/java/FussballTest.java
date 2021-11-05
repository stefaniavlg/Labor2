import com.company.Fussball;
import com.company.Mannschaftssport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FussballTest {
    @Test
    public void kalkuliereZeit(){
        Mannschaftssport fuss = new Fussball();

        double result = fuss.kalkuliereZeit();
        assertEquals(65.0,result);
    }
}
