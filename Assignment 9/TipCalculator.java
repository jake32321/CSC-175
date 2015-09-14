/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class TipCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner prompt = new Scanner(System.in);
       
       System.out.println("What was the total cost of your meal?");
       double mealPrice = prompt.nextDouble();
       
       System.out.println("How would you rate the service you were given?"
               + "\n1-Totally Statisfactory \n2-Satisfactory "
               + "\n3-Dissatisfactory");
       int feedback = prompt.nextInt();
       
       switch(feedback)
       {
           case 1:
               double tip = Math.round(mealPrice*0.2);
               double total = tip+mealPrice;
               System.out.println("The total price of the meal is "+total
                       + " and the service was rated Totally Satisfactory.");
               break;
           case 2:
               double tip2 = Math.round(mealPrice*0.15);
               double total2 = tip2+mealPrice;
               System.out.println("The total price of the meal is "+total2
                       + " and the service was rated Satisfactory.");
               break;
           case 3:
               double tip3 = Math.round(mealPrice*0.1);
               double total3 = mealPrice+tip3;
               System.out.println("The total price of the meal is "+total3
                       + " and the service was rated Dissatisfactory.");
               break;
               
           default:
               System.out.println("Error! The value you have enetered is not "
                       + "applicable!");
       }
        
    }
}
