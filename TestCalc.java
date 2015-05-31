/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Calc;
import junit.framework.TestCase;
/**
 *
 * @author thiago
 */
public class TestCalc extends TestCase {
    
    public TestCalc() {
    }
    public void testSoma(){
        float passaN1 = 10;
        float passaN2 = 5;
        float retornoEsperado = 15;
        float retornoFeito = Calc.soma(passaN1, passaN2);
        assertEquals (retornoEsperado, retornoFeito, 0);
    }
    public void testSubtracao(){
        float passaN1 = 10;
        float passaN2 = 5;
        float retornoEsperado = 5;
        float retornoFeito = Calc.subtracao(passaN1, passaN2);
        assertEquals (retornoEsperado, retornoFeito, 0);
    }
    public void testMultiplicacao(){
        float passaN1 = 10;
        float passaN2 = 5;
        float retornoEsperado = 50;
        float retornoFeito = Calc.multiplicacao(passaN1, passaN2);
        assertEquals (retornoEsperado, retornoFeito, 0);
    }
    public void testDivisao(){
        float passaN1 = 10;
        float passaN2 = 5;
        float retornoEsperado = 2;
        float retornoFeito = Calc.divisao(passaN1, passaN2);
        assertEquals (retornoEsperado, retornoFeito, 0);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
