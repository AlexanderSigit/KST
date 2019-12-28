/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kst_assesment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felicia
 */
public class NameTest {
    
    public NameTest() {
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
     * Test of getName method, of class Name.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String fullName = "Alexander Sigit";
        String[] expResult = {"Alexander","Sigit"};
        String[] result = Name.getName(fullName);
        assertArrayEquals(expResult, result);        
    }

    /**
     * Test of getFirstName method, of class Name.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Name instance = new Name("Alexander", "Sigit");
        String expResult = "Alexander";
        String result = instance.getFirstName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getLastName method, of class Name.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Name instance = new Name("Alexander", "Sigit");
        String expResult = "Sigit";
        String result = instance.getLastName();
        assertEquals(expResult, result);   ;        
    }

    /**
     * Test of toString method, of class Name.
     */
    @Test
    public void testToString() {
        System.out.println("ToString");
        Name instance = new Name("Alexander", "Sigit");
        String expResult = "AlexanderSigit";
        String result = instance.toString();
        assertEquals(expResult, result);      
    }
    
}
