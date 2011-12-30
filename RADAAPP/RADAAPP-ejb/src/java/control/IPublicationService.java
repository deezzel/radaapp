/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.Publication;
import java.util.List;
import model.Users;


/**
 *
 * @author Julia
 */
public interface IPublicationService {
    
   // public List<Publication> getByTypeDate (String type, Date date_add);
    
    public List<Publication> findByText (String substr);
    
    public List<Publication> findByDate (String date);
    
    public List<Publication> getByTitle (String title);
    
    public List<Publication> getByOrderDate (String type);
    
    public List<Publication> getByAvtor (Users usr);
    
    public List<Publication> getByTypeDate(String type);
}
