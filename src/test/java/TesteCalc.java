/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.ParouImpar;

/**
 *
 * @author Alex
 */
public class TesteCalc {
    
    @Test         
    public void Teste1(){
    ParouImpar c = new ParouImpar();
    assertEquals(1L, c.parouimpar(1));
} 
    @Test         
    public void Teste2(){
    ParouImpar c = new ParouImpar();
    assertEquals(2L, c.parouimpar(2));
} 
    @Test
    public void Teste3() {
    ParouImpar c = new ParouImpar();
    assertEquals(3L, c.parouimpar(3));
    }
    
    @Test         
    public void Teste4(){
    ParouImpar c = new ParouImpar();
    assertEquals(4L, c.parouimpar(4));
} 
    
    
    
}
