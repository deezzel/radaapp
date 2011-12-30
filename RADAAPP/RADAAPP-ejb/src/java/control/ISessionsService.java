/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import java.util.List;
import model.Sessions;

/**
 *
 * @author Julia
 */
public interface ISessionsService {

    public List<Sessions> getByDate(Date date);

    public List<Sessions> getByOrderDate();

    public List<Sessions> findByType(String type);
}
