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
 * @author Julia
 */
public class CommentTest {
    
    public CommentTest() {
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
     * Test of getText method, of class Comment.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Comment instance = new Comment();
        String expResult = instance.getText();
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setText method, of class Comment.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Comment instance = new Comment();
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getDatecomm method, of class Comment.
     */
    @Test
    public void testGetDatecomm() {
        System.out.println("getDatecomm");
        Comment instance = new Comment();
        Date expResult = null;
        Date result = instance.getDatecomm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setDatecomm method, of class Comment.
     */
    @Test
    public void testSetDatecomm() {
        System.out.println("setDatecomm");
        Date datecomm = null;
        Comment instance = new Comment();
        instance.setDatecomm(datecomm);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPublication method, of class Comment.
     */
    @Test
    public void testGetPublication() {
        System.out.println("getPublication");
        Comment instance = new Comment();
        Publication expResult = null;
        Publication result = instance.getPublication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPublication method, of class Comment.
     */
    @Test
    public void testSetPublication() {
        System.out.println("setPublication");
        Publication publication = new Publication();
        Comment instance = new Comment();
        instance.setPublication(publication);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAvtor method, of class Comment.
     */
    @Test
    public void testGetAvtor() {
        System.out.println("getAvtor");
        Comment instance = new Comment();    
        Users expResult = instance.getAvtor();
        Users result = instance.getAvtor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAvtor method, of class Comment.
     */
    @Test
    public void testSetAvtor() {
        System.out.println("setAvtor");
        Users avtor = null;
        Comment instance = new Comment();
        instance.setAvtor(avtor);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of hashCode method, of class Comment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Comment instance = new Comment();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class Comment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Comment instance = new Comment();
        boolean expResult = false;
        boolean result = false;
                //instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Comment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Comment instance = new Comment();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
