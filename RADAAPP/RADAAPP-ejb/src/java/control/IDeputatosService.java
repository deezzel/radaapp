/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Deputatos;

/**
 *
 * @author Julia
 */
public interface IDeputatosService {
    
    public List<Deputatos> getByShipment (Long id_ship);
    
  //  public List<Deputatos> getByProtocol (Long id_prot);    
    
}
