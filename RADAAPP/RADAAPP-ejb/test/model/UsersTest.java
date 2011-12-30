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
public class UsersTest {
    
    public UsersTest() {
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
     * Test of addPublication method, of class Users.
     */
    @Test
    public void testAddPublication() {
        System.out.println("addPublication");
        Publication publ = null;
        Users instance = new Users();
        instance.addPublication(publ);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of delPublication method, of class Users.
     */
    @Test
    public void testDelPublication() {
        System.out.println("delPublication");
        Publication publ = null;
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.delPublication(publ);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addComment method, of class Users.
     */
    @Test
    public void testAddComment() {
        System.out.println("addComment");
        Comment comm = null;
        Users instance = new Users();
        instance.addComment(comm);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delComment method, of class Users.
     */
    @Test
    public void testDelComment() {
        System.out.println("delComment");
        Comment comm = null;
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.delComment(comm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addProtocol method, of class Users.
     */
    @Test
    public void testAddProtocol() {
        System.out.println("addProtocol");
        Protocol prot = null;
        Users instance = new Users();
        instance.addProtocol(prot);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delProtocol method, of class Users.
     */
    @Test
    public void testDelProtocol() {
        System.out.println("delProtocol");
        Protocol prot = null;
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.delProtocol(prot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRoleuser method, of class Users.
     */
    @Test
    public void testGetRoleuser() {
        System.out.println("getRoleuser");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getRoleuser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRoleuser method, of class Users.
     */
    @Test
    public void testSetRoleuser() {
        System.out.println("setRoleuser");
        String roleuser = "";
        Users instance = new Users();
        instance.setRoleuser(roleuser);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getProtocolList method, of class Users.
     */
    @Test
    public void testGetProtocolList() {
        System.out.println("getProtocolList");
        Users instance = new Users();
        List expResult = null;
        List result = instance.getProtocolList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setProtocolList method, of class Users.
     */
    @Test
    public void testSetProtocolList() {
        System.out.println("setProtocolList");
        List<Protocol> protocolList = null;
        Users instance = new Users();
        instance.setProtocolList(protocolList);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCommentList method, of class Users.
     */
    @Test
    public void testGetCommentList() {
        System.out.println("getCommentList");
        Users instance = new Users();
        List expResult = null;
        List result = instance.getCommentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCommentList method, of class Users.
     */
    @Test
    public void testSetCommentList() {
        System.out.println("setCommentList");
        List<Comment> commentList = null;
        Users instance = new Users();
        instance.setCommentList(commentList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPublicationList method, of class Users.
     */
    @Test
    public void testGetPublicationList() {
        System.out.println("getPublicationList");
        Users instance = new Users();
        List expResult = null;
        List result = instance.getPublicationList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPublicationList method, of class Users.
     */
    @Test
    public void testSetPublicationList() {
        System.out.println("setPublicationList");
        List<Publication> publicationList = null;
        Users instance = new Users();
        instance.setPublicationList(publicationList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Users.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Users instance = new Users();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class Users.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of toString method, of class Users.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Users instance = new Users();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
