/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class SecretaryTest {
    
    public SecretaryTest() {
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
     * Test of addSession method, of class Secretary.
     */
    @Test
    public void testAddSession() {
        System.out.println("addSession");
        Sessions sess = null;
        Secretary instance = new Secretary();
        instance.addSession(sess);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of delSession method, of class Secretary.
     */
    @Test
    public void testDelSession() {
        System.out.println("delSession");
        Sessions sess = null;
        Secretary instance = new Secretary();
        instance.delSession(sess);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLogin method, of class Secretary.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLogin method, of class Secretary.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Secretary instance = new Secretary();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Secretary.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class Secretary.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Secretary instance = new Secretary();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPassword method, of class Secretary.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPassword method, of class Secretary.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Secretary instance = new Secretary();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getSecname method, of class Secretary.
     */
    @Test
    public void testGetSecname() {
        System.out.println("getSecname");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getSecname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSecname method, of class Secretary.
     */
    @Test
    public void testSetSecname() {
        System.out.println("setSecname");
        String secname = "";
        Secretary instance = new Secretary();
        instance.setSecname(secname);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPatronymic method, of class Secretary.
     */
    @Test
    public void testGetPatronymic() {
        System.out.println("getPatronymic");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getPatronymic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPatronymic method, of class Secretary.
     */
    @Test
    public void testSetPatronymic() {
        System.out.println("setPatronymic");
        String patronymic = "";
        Secretary instance = new Secretary();
        instance.setPatronymic(patronymic);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPhone method, of class Secretary.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPhone method, of class Secretary.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Secretary instance = new Secretary();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSessionsList method, of class Secretary.
     */
    @Test
    public void testGetSessionsList() {
        System.out.println("getSessionsList");
        Secretary instance = new Secretary();
        List expResult = null;
        List result = instance.getSessionsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSessionsList method, of class Secretary.
     */
    @Test
    public void testSetSessionsList() {
        System.out.println("setSessionsList");
        List<Sessions> sessionsList = null;
        Secretary instance = new Secretary();
        instance.setSessionsList(sessionsList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Secretary.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Secretary instance = new Secretary();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of equals method, of class Secretary.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Secretary instance = new Secretary();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Secretary.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
