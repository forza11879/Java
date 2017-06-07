/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countme;

class Box {
    static int count;

    Box() {
        count++;
    }
    
    int value;
}


public class CountMe {

  
    public static void main(String[] args) {
        // TODO cod
        
        System.out.println(Box.count);
        new Box();
        System.out.println(Box.count);
        new Box();
        System.out.println(Box.count);
        new Box();
              
     
    }
    
}
