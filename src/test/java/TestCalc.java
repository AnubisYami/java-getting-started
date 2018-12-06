import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Calculadora;



public class TesteCalc {

    @Test
    public void Teste1() {
        Calculadora c = new Calculadora();
        assertEquals(1L,c.calc(1));
    }