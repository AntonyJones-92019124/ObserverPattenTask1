/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattentask1;

/**
 *
 * @author 92019124
 */
public class ObservablePatternV1 {
 
    public static void main(String[] args) {
        
        Person personManu = new Person("Manu");
        Person personTama = new Person("Tama");
        
        Product productUte = new Product("4x4Ute");
        
        // register the observers 
        productUte.registerObserver(personManu);
        productUte.registerObserver(personTama);
        
        //calling setQty > 0 should issue notification.
        productUte.setQty(10);
    }
}
