/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.Laws;
import java.util.List;
import model.Sessions;
import model.Users;

/**
 *
 * @author Julia
 */
public interface ILawsService {
    
    public boolean addLaw (Laws law, Users deput);
    
    public boolean removeLaw (Laws law, Users deput);
    
    public List<Laws> getByTitle (String title);
    
    public List<Laws> getByDate (Date date);

    public List<Laws> getBySession (Sessions sess_id);
    
    public List<Laws> getByNOTSession (Sessions sess_id);
    //запросы написать в классах домена
    public List<Laws> findByText (String text);
      
} 
