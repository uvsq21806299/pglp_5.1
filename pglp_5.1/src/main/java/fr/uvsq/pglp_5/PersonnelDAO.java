/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_5;


/**
 *
 * @author andri
 */
public class PersonnelDAO extends DAO<Personnel>{

    @Override
    public Personnel create(Personnel personne) {
        return personne;
    }

    @Override
    public Personnel find(String find) {
        Personnel personne = null;
        return personne;
    }

    @Override
    public Personnel update(Personnel personne) {
        return null;

    }

    @Override
    public void delete(Personnel personne) {
    }

    
}
