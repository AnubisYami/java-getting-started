import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Calculadora;



public class TesteCalc {

    @Test
    public void Teste1() {
        Calculadora c = new Calculadora();
        if(c % 2 == 0)
          System.out.println("É par!");
      
      else
        System.out.println("É impar!");
    }