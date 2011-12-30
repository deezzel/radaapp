/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia
 */
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of create method, of class UserService.
     */
    @Ignore
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Users entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class UserService.
     */
    @Ignore
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Users entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UserService.
     */
    @Ignore
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Users entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class UserService.
     */
    @Ignore
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        Users expResult = null;
        //Users result = instance.find(id);
       // assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class UserService.
     */
    @Ignore
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class UserService.
     */
    @Ignore
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class UserService.
     */
    @Ignore
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserService.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String login = "julia";
        String passwd = "julia";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        boolean expResult = true;
        boolean result = instance.login(login, passwd);
        assertTrue(result);
        container.close();
    }

    /**
     * Test of registration method, of class UserService.
     */
    @Ignore
    @Test
    public void testRegistration() throws Exception {
        System.out.println("registration");
        Users user = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        boolean expResult = false;
        boolean result = instance.registration(user);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserRole method, of class UserService.
     */
    @Ignore
    @Test
    public void testGetUserRole() throws Exception {
        System.out.println("getUserRole");
        String login = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        String expResult = "";
        String result = instance.getUserRole(login);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByLogin method, of class UserService.
     */
    @Test
    public void testGetByLogin() throws Exception {
        System.out.println("getByLogin");
        String login = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        Users expResult = null;
        Users result = instance.getByLogin(login);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class UserService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserService instance = (UserService)container.getContext().lookup("java:global/classes/UserService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
