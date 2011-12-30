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
public class SessionsTest {
    
    public SessionsTest() {
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
     * Test of addLaw method, of class Sessions.
     */
    @Test
    public void testAddLaw() {
        System.out.println("addLaw");
        Laws law = null;
        Sessions instance = new Sessions();
        instance.addLaw(law);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delLaw method, of class Sessions.
     */
    @Test
    public void testDelLaw() {
        System.out.println("delLaw");
        Laws law = null;
        Sessions instance = new Sessions();
        instance.delLaw(law);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addProtoc method, of class Sessions.
     */
    @Test
    public void testAddProtoc() {
        System.out.println("addProtoc");
        Protocol prot = null;
        Sessions instance = new Sessions();
        instance.addProtoc(prot);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delProtoc method, of class Sessions.
     */
    @Test
    public void testDelProtoc() {
        System.out.println("delProtoc");
        Protocol prot = null;
        Sessions instance = new Sessions();
        instance.delProtoc(prot);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCountparticipants method, of class Sessions.
     */
    @Test
    public void testGetCountparticipants() {
        System.out.println("getCountparticipants");
        Sessions instance = new Sessions();
        int expResult = 0;
        int result = instance.getCountparticipants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCountparticipants method, of class Sessions.
     */
    @Test
    public void testSetCountparticipants() {
        System.out.println("setCountparticipants");
        int countparticipants = 0;
        Sessions instance = new Sessions();
        instance.setCountparticipants(countparticipants);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTimeleadthrou method, of class Sessions.
     */
    @Test
    public void testGetTimeleadthrou() {
        System.out.println("getTimeleadthrou");
        Sessions instance = new Sessions();
        Date expResult = null;
        Date result = instance.getTimeleadthrou();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTimeleadthrou method, of class Sessions.
     */
    @Test
    public void testSetTimeleadthrou() {
        System.out.println("setTimeleadthrou");
        Date timeleadthrou = null;
        Sessions instance = new Sessions();
        instance.setTimeleadthrou(timeleadthrou);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeadsession method, of class Sessions.
     */
    @Test
    public void testGetHeadsession() {
        System.out.println("getHeadsession");
        Sessions instance = new Sessions();
        String expResult = "";
        String result = instance.getHeadsession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeadsession method, of class Sessions.
     */
    @Test
    public void testSetHeadsession() {
        System.out.println("setHeadsession");
        String headsession = "";
        Sessions instance = new Sessions();
        instance.setHeadsession(headsession);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Sessions.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Sessions instance = new Sessions();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setType method, of class Sessions.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Sessions instance = new Sessions();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getProtocolList method, of class Sessions.
     */
    @Test
    public void testGetProtocolList() {
        System.out.println("getProtocolList");
        Sessions instance = new Sessions();
        List expResult = null;
        List result = instance.getProtocolList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setProtocolList method, of class Sessions.
     */
    @Test
    public void testSetProtocolList() {
        System.out.println("setProtocolList");
        List<Protocol> protocolList = null;
        Sessions instance = new Sessions();
        instance.setProtocolList(protocolList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSecretary method, of class Sessions.
     */
   
   
    @Test
    public void testGetLawsList() {
        System.out.println("getLawsList");
        Sessions instance = new Sessions();
        List expResult = null;
        List result = instance.getLawsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setLawsList method, of class Sessions.
     */
    @Test
    public void testSetLawsList() {
        System.out.println("setLawsList");
        List<Laws> lawsList = null;
        Sessions instance = new Sessions();
        instance.setLawsList(lawsList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Sessions.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Sessions instance = new Sessions();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of equals method, of class Sessions.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Sessions instance = new Sessions();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Sessions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sessions instance = new Sessions();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
