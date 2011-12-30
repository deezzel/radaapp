/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
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
public class ProtocolTest {
    
    public ProtocolTest() {
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
     * Test of getTimeWhenReg method, of class Protocol.
     */
    @Test
    public void testGetTimeWhenReg() {
        System.out.println("getTimeWhenReg");
        Protocol instance = new Protocol();
        Date expResult = null;
        Date result = instance.getTimeWhenReg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTimeWhenReg method, of class Protocol.
     */
    @Test
    public void testSetTimeWhenReg() {
        System.out.println("setTimeWhenReg");
        Date timeWhenReg = null;
        Protocol instance = new Protocol();
        instance.setTimeWhenReg(timeWhenReg);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSession method, of class Protocol.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        Protocol instance = new Protocol();
        Sessions expResult = null;
        Sessions result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSession method, of class Protocol.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Sessions session = null;
        Protocol instance = new Protocol();
        instance.setSession(session);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDeputat method, of class Protocol.
     */
    @Test
    public void testGetDeputat() {
        System.out.println("getDeputat");
        Protocol instance = new Protocol();
        Deputatos expResult = null;
        Users result = instance.getDeputat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDeputat method, of class Protocol.
     */
    @Test
    public void testSetDeputat() {
        System.out.println("setDeputat");
        Users deputat = null;
        Protocol instance = new Protocol();
        instance.setDeputat(deputat);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAvtor method, of class Protocol.
     */
    @Test
    public void testGetAvtor() {
        System.out.println("getAvtor");
        Protocol instance = new Protocol();
        Users expResult = null;
        Users result = instance.getAvtor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAvtor method, of class Protocol.
     */
    @Test
    public void testSetAvtor() {
        System.out.println("setAvtor");
        Users avtor = null;
        Protocol instance = new Protocol();
        instance.setAvtor(avtor);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of hashCode method, of class Protocol.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Protocol instance = new Protocol();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class Protocol.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Protocol instance = new Protocol();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Protocol.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Protocol instance = new Protocol();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
