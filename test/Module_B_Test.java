/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Nathan Chai
 */
public class Module_B_Test {
    
    @Test
    public void test() {
        Module_B module_b = new Module_B();
        
        assertEquals("This should return Two", 2, module_b.return_two());
    }
    
  
}
