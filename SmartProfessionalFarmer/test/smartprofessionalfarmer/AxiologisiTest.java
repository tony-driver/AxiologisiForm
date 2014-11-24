/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartprofessionalfarmer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tony
 */
public class AxiologisiTest {
    
    public AxiologisiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of TextCheck method, of class Axiologisi.
     */
    @Test
    public void testTextCheck() {
        System.out.println("TextCheck");
        String fname = "";
        Axiologisi instance = null;
        boolean expResult = false;
        boolean result = instance.TextCheck(fname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Axiologisi.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Axiologisi.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
