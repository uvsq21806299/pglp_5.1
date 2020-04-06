/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andri
 * @param <T>
 */
public abstract class Dao<T> {
    
    public abstract T create (T obj ) ; 
    public abstract T find ( String id ) ; 
    public abstract T update(T obj ) ; 
    public abstract void delete (T obj ) ;

    
}
