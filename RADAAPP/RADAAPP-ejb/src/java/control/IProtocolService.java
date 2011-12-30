/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Deputatos;
import model.Protocol;
import model.Sessions;

/**
 *
 * @author Julia
 */
public interface IProtocolService {
    
    public List<Protocol> getBySession (Long id_sess);
    
    public List<Protocol> getBySessionS(Sessions sess);
    
    public boolean addProtocol (Protocol prot, Sessions sess);
    
    public boolean delProtocol (Protocol prot, Sessions sess);
    
    public List<Deputatos> getDepbyProt (Long id);
      
    
}
