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
public class Module_A_Test {
    
    @Test
    public void test() {
        Module_A module_a = new Module_A();
        
        assertEquals("This should return 1", 1, module_a.return_num());
    }
    
    @Test
    public void test2() {
        Module_A module_a = new Module_A();
        
        assertEquals("This should return 2", 2, module_a.return_num() + 1);
    }
}
