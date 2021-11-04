import com.company.Basketball;
import com.company.Mannschaftssport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasketballTest {

    @Test
    public void kalkuliereZeit(){
        Mannschaftssport b = new Basketball();

        double rez = b.kalkuliereZeit();
        assertEquals(55.0,rez);
    }
}
