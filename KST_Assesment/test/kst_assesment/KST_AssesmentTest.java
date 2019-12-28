/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kst_assesment;

import java.io.File;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
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
public class KST_AssesmentTest {
    
    public KST_AssesmentTest() {
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
     * Test of main method, of class KST_Assesment.
     */
    @Test
    public void testMain() {
        System.out.println("main");        
        String input = "name-sorter ./unsorted-names-list.txt";                                                             
        assertEquals("name-sorter",input.split(" ")[0]);                
    }

    /**
     * Test of readFile method, of class KST_Assesment.
     */
    @Test
    public void testReadFile(){
        System.out.println("testReadFile");        
        File baseFile = new File("./unsorted-names-list.txt");
        assertTrue(baseFile.exists());
    }

    /**
     * Test of writeFile method, of class KST_Assesment.
     */
    @Test
    public void testWriteFile() {
        System.out.println("testWriteFile");        
        File baseFile = new File("./sorted-names-list.txt");
        assertTrue(baseFile.exists());
    }
    
}
