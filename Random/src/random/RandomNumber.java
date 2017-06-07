/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ipd
 */
public class RandomNumber {
    
    public static void main(String[] args) {
        
        int myRandom1 = 0;
        int myRandom2 = 0;
        
        myRandom1 = (int)(Math.random()*10);
        System.out.println("First Random number (0 to 9):" + myRandom1 );
        
        myRandom2 = (int)(Math.random()*10 + 1);
        System.out.println("Second Random number (1 to 9):" + myRandom2 );
        
    }
}
