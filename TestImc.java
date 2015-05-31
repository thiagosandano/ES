/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.imc;
import junit.framework.TestCase;

/**
 *
 * @author thiago
 */
public class TesImc extends TestCase {
    
    public TesImc() {
        
   }
    
    public void testimc(){
        float passapeso = 25;
        float passaaltura = 5;
        float retornoEsperado = 1;
        float retornoFeito = imc.imc(passapeso, passaaltura);
        assertEquals (retornoEsperado, retornoFeito, 0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
