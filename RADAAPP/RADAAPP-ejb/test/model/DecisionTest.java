/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deezzel
 */
public class DecisionTest {
    
    public DecisionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCntprotiv method, of class Decision.
     */
    @Test
    public void testGetCntprotiv() {
        System.out.println("getCntprotiv");
        Decision instance = new Decision();
        int expResult = 0;
        int result = instance.getCntprotiv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCntprotiv method, of class Decision.
     */
    @Test
    public void testSetCntprotiv() {
        System.out.println("setCntprotiv");
        int cntprotiv = 0;
        Decision instance = new Decision();
        instance.setCntprotiv(cntprotiv);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCntza method, of class Decision.
     */
    @Test
    public void testGetCntza() {
        System.out.println("getCntza");
        Decision instance = new Decision();
        int expResult = 0;
        int result = instance.getCntza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCntza method, of class Decision.
     */
    @Test
    public void testSetCntza() {
        System.out.println("setCntza");
        int cntza = 0;
        Decision instance = new Decision();
        instance.setCntza(cntza);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescript method, of class Decision.
     */
    @Test
    public void testGetDescript() {
        System.out.println("getDescript");
        Decision instance = new Decision();
        String expResult = instance.getDescript();
        String result = instance.getDescript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescript method, of class Decision.
     */
    @Test
    public void testSetDescript() {
        System.out.println("setDescript");
        String descript = "";
        Decision instance = new Decision();
        instance.setDescript(descript);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPopruvki method, of class Decision.
     */
    @Test
    public void testGetPopruvki() {
        System.out.println("getPopruvki");
        Decision instance = new Decision();
        String expResult = instance.getPopruvki();
        String result = instance.getPopruvki();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPopruvki method, of class Decision.
     */
    @Test
    public void testSetPopruvki() {
        System.out.println("setPopruvki");
        String popruvki = "";
        Decision instance = new Decision();
        instance.setPopruvki(popruvki);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLaw method, of class Decision.
     */
    @Test
    public void testGetLaw() {
        System.out.println("getLaw");
        Decision instance = new Decision();
        Laws expResult = null;
        Laws result = instance.getLaw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLaw method, of class Decision.
     */
    @Test
    public void testSetLaw() {
        System.out.println("setLaw");
        Laws law = null;
        Decision instance = new Decision();
        instance.setLaw(law);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Decision.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Decision instance = new Decision();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Decision.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Decision instance = new Decision();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Decision.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Decision instance = new Decision();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
