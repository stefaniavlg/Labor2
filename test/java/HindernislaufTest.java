import com.company.Hindernislauf;
import com.company.Leichtathletik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HindernislaufTest {
    @Test
    public void kalkuliereZeit(){
        Leichtathletik hindernislauf = new Hindernislauf();

        double result = hindernislauf.kalkuliereZeit();
        assertEquals(30.0,result);
    }
}
