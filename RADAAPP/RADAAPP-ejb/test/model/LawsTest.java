/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class LawsTest {
    
    public LawsTest() {
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
     * Test of getDescript method, of class Laws.
     */
    @Test
    public void testGetDescript() {
        System.out.println("getDescript");
        Laws instance = new Laws();
        String expResult = instance.getDescript();
        String result = instance.getDescript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setDescript method, of class Laws.
     */
    @Test
    public void testSetDescript() {
        System.out.println("setDescript");
        String descript = "";
        Laws instance = new Laws();
        instance.setDescript(descript);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTimeAccept method, of class Laws.
     */
    @Test
    public void testGetTimeAccept() {
        System.out.println("getTimeAccept");
        Laws instance = new Laws();
        Date expResult = null;
        Date result = instance.getTimeAccept();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTimeAccept method, of class Laws.
     */
    @Test
    public void testSetTimeAccept() {
        System.out.println("setTimeAccept");
        Date timeAccept = null;
        Laws instance = new Laws();
        instance.setTimeAccept(timeAccept);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTitle method, of class Laws.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Laws instance = new Laws();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTitle method, of class Laws.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Laws instance = new Laws();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSession method, of class Laws.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        Laws instance = new Laws();
        Sessions expResult = null;
        Sessions result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSession method, of class Laws.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Sessions session = null;
        Laws instance = new Laws();
        instance.setSession(session);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAvtor method, of class Laws.
     */
    @Test
    public void testGetAvtor() {
        System.out.println("getAvtor");
        Laws instance = new Laws();
        Users expResult = null;
        Users result = instance.getAvtor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setAvtor method, of class Laws.
     */
    @Test
    public void testSetAvtor() {
        System.out.println("setAvtor");
        Users avtor = null;
        Laws instance = new Laws();
        instance.setAvtor(avtor);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDecisionList method, of class Laws.
     */
    @Test
    public void testGetDecisionList() {
        System.out.println("getDecisionList");
        Laws instance = new Laws();
        Decision expResult = null;
        Decision result = instance.getDecision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDecisionList method, of class Laws.
     */
    @Test
    public void testSetDecisionList() {
        System.out.println("setDecisionList");
       Decision decisionList = null;
        Laws instance = new Laws();
        instance.setDecision(decisionList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Laws.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Laws instance = new Laws();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class Laws.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Laws instance = new Laws();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Laws.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Laws instance = new Laws();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
