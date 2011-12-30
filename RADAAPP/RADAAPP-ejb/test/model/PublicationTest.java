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
public class PublicationTest {
    
    public PublicationTest() {
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
     * Test of addComment method, of class Publication.
     */
    @Test
    public void testAddComment() {
        System.out.println("addComment");
        Comment comm = null;
        Publication instance = new Publication();
        instance.addComment(comm);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delComment method, of class Publication.
     */
    @Test
    public void testDelComment() {
        System.out.println("delComment");
        Comment comm = null;
        Publication instance = new Publication();
        instance.delComment(comm);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDate_publ method, of class Publication.
     */
    @Test
    public void testGetDate_publ() {
        System.out.println("getDate_publ");
        Publication instance = new Publication();
        Date expResult = null;
        Date result = instance.getDate_publ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDate_publ method, of class Publication.
     */
    @Test
    public void testSetDate_publ() {
        System.out.println("setDate_publ");
        Date date_publ = null;
        Publication instance = new Publication();
        instance.setDate_publ(date_publ);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of gettitle method, of class Publication.
     */
    @Test
    public void testGettitle() {
        System.out.println("gettitle");
        Publication instance = new Publication();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of settitle method, of class Publication.
     */
    @Test
    public void testSettitle() {
        System.out.println("settitle");
        String title = "";
        Publication instance = new Publication();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getText method, of class Publication.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Publication instance = new Publication();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setText method, of class Publication.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Publication instance = new Publication();
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getDate method, of class Publication.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Publication instance = new Publication();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setDate method, of class Publication.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Publication instance = new Publication();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Publication.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Publication instance = new Publication();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setType method, of class Publication.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Publication instance = new Publication();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCommentList method, of class Publication.
     */
    @Test
    public void testGetCommentList() {
        System.out.println("getCommentList");
        Publication instance = new Publication();
        List expResult = null;
        List result = instance.getCommentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCommentList method, of class Publication.
     */
    @Test
    public void testSetCommentList() {
        System.out.println("setCommentList");
        List<Comment> commentList = null;
        Publication instance = new Publication();
        instance.setCommentList(commentList);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAvtor method, of class Publication.
     */
    @Test
    public void testGetAvtor() {
        System.out.println("getAvtor");
        Publication instance = new Publication();
        Users expResult = null;
        Users result = instance.getAvtor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAvtor method, of class Publication.
     */
    @Test
    public void testSetAvtor() {
        System.out.println("setAvtor");
        Users avtor = null;
        Publication instance = new Publication();
        instance.setAvtor(avtor);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hashCode method, of class Publication.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Publication instance = new Publication();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of equals method, of class Publication.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Publication instance = new Publication();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Publication.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Publication instance = new Publication();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
