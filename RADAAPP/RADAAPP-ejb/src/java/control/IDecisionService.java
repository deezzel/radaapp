 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Decision;
import model.Laws;

/**s
 *
 * @author Julia
 */
public interface IDecisionService {
    
    public Decision getByLaw (Laws law);
    
    public boolean addDecision (Decision decis, Laws law);
}
