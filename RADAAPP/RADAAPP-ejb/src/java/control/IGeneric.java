/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;

/**
 *
 * @author Julia
 */
public interface IGeneric<T> {

    int count();

    void create(T entity);

    void edit(T entity);

    T find(Long id);

    List<T> findAll();

    List<T> findRange(int[] range);

    void remove(T entity);
    
}
