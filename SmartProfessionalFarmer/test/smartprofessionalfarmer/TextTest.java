import static java.awt.SystemColor.text;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import smartprofessionalfarmer.Axiologisi;
/**
 *
 * @author Tony
 */
public class TextTest {
    @Test
    public void CharacterTest() {
        String text = "Antonis";
        boolean expected;
        expected = true;
        Axiologisi test = new Axiologisi();
        
        boolean result = test.TextCheck(text);
        assertEquals(expected, result);
    }
    
    @Test
    public void IsEmptyTest() {
        String text = "";
        boolean expected = false;
        Axiologisi test = new Axiologisi();
        
        boolean result = test.TextCheck(text);
        assertEquals(expected, result);
    }
    
    @Test
    public void SymbolTest() {
        String text = "A#(n/t&o*n^i$s%";
        boolean expected = false;
        Axiologisi test = new Axiologisi();
        
        boolean result = test.TextCheck(text);
        assertEquals(expected, result);
    }
}
