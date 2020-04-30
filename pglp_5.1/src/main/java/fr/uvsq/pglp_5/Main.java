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
public class Main {
    
    
    public static void main(String[] args){
        
            CompositePersonnel entreprise = new CompositePersonnel("Entreprise");
            CompositePersonnel contenu1 = new CompositePersonnel("Departement 1 ");
            CompositePersonnel contenu2 = new CompositePersonnel("Departement 2 ");

            Personnel pers1 = new Personnel.Builder("RAMAROSON", "Andritsalama", 001).build();
            Personnel pers2 = new Personnel.Builder("RANDRIA", "Miora", 002).build(); 

            contenu1.add(pers1);
            contenu2.add(pers2);
            
            entreprise.add(contenu1);
            entreprise.add(contenu2);
            
            entreprise.list();
            contenu1.list();
            contenu2.getElements();
    
    
    } 
    
}
