/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servicimplem;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Comment;
import model.Publication;
import model.Users;
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
public class CommentServiceTest {
    
    public CommentServiceTest() {
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
     * Test of create method, of class CommentService.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Comment entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of edit method, of class CommentService.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Comment entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class CommentService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Comment entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of find method, of class CommentService.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        Comment expResult = null;
        Comment result = instance.find(Long.valueOf(id));
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findAll method, of class CommentService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findRange method, of class CommentService.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of count method, of class CommentService.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of persist method, of class CommentService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getByIDPublication method, of class CommentService.
     */
    @Test
    public void testGetByIDPublication() throws Exception {
        System.out.println("getByPublication");
        Publication id_pub = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        List expResult = null;
        List result = instance.getByPublication(id_pub);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add_Comment method, of class CommentService.
     */
    @Test
    public void testAdd_Comment() throws Exception {
        System.out.println("add_Comment");
        Comment com = null;
        Publication pub = null;
        Users usr = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        boolean expResult = false;
        boolean result = instance.add_Comment(com, pub, usr);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove_Comment method, of class CommentService.
     */
    @Test
    public void testRemove_Comment() throws Exception {
        System.out.println("remove_Comment");
        Comment com = null;
        Publication pub = null;
        Users usr = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        boolean expResult = false;
        boolean result = instance.remove_Comment(com, pub, usr);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getByPublication method, of class CommentService.
     */
    @Test
    public void testGetByPublication() throws Exception {
        System.out.println("getByPublication");
        Publication pub = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommentService instance = (CommentService)container.getContext().lookup("java:global/classes/CommentService");
        List expResult = null;
        List result = instance.getByPublication(pub);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
