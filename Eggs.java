/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs; 

import java.util.Scanner;

/**
 *
 * @author Rashmi Singh
 * Purpose : Displaying the number of eggs and the price of eggs.
 * Date : 6th Sept 2021
 * Version : 1.0
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dozen, individualegg ;
        double price;
        final double priceofdozen = 3.25;
        final double priceofindividualegg = 0.45;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of eggs you wish to buy.");
        int eggs = inputDevice.nextInt();
        dozen = eggs/12;
        individualegg = eggs % 12;
        price = (dozen * priceofdozen) + (individualegg * priceofindividualegg);
        System.out.println("You have ordered " + eggs + " eggs. That's a " + dozen + " dozen at $" + priceofdozen +" per dozen and " + individualegg + " loose eggs at " + priceofindividualegg + " cents each for a total of $" + price + ".");
        
                
        
// TODO code application logic here
    }
    
}
