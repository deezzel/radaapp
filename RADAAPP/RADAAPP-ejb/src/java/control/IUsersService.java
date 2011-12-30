/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Local;
import model.Users;

/**
 *
 * @author Julia
 */
@Local
public interface IUsersService  {
    
    public boolean login (String login, String passwd);
    
    public Users getByLogin (String login);
    
    public boolean registration (Users user);
}
