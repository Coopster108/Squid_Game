/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squid_game;

import java.util.Scanner;

/**
 *
 * @author cooperwhittemore
 */
public class Squid_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //by ER
        int lifeCount; //may or may not turn this into an incrementor method later
        lifeCount = 5;
        
        String color;
        Scanner kb = new Scanner(System.in);
        System.out.println("You are Squidward Tenticals stuck\n"
                + "in the future. You've arrived in an\n"
                + "empty room with virtual\n"
                + "transportation squares.\n"
                + "Choose a square\n"
                + "\n"
                + "[red, blue, green purple]");
        
    color = kb.next();
    
    if(color.charAt(0)=='b') //blue path
    {
        System.out.println("Blue");
        //blue branches below
            System.out.println("You've been ejected into space. You're moving at dangerous speeds. Slow down!\n"
                    + "\n");
            
            //do while loop
            double speed;
            do
            {
                System.out.println("[enter a speed below 2500]");
                speed = kb.nextDouble();
            } while(speed >= 2500);
        
        String ans;
        System.out.println("\nYou're marooned on planet Zorg! Would you like an oxygen tank?\n");
        ans = kb.next();
        
        //by CW
        if(ans.charAt(0)== 'n')
        {
            //code here, check flowchart
        }
        else //if yes
        {
            //move on to next step
        }
        }
        
    else //by ER
        if(color.charAt(0)=='g') //green path
        {
            System.out.println("Green");
            //green branches below
            System.out.println("Oh no!\n"
                    + "You've gone even further into the future!" 
                    + "Choose a year to return to.\n"
                    + "Unfortunately your home year, 2015 is not available");
            
            int year;
            do
            {
                System.out.println("Your year must fall between 2500 and 2600");
                year = kb.nextInt();
            } while(year < 2500 || year > 2600);
            
            //next step
            //these steps require methods in separate classes, just do sout-tabs containing the info, I'll modify them later
            //by CW
        }
        else    //by ER
            if(color.charAt(0)=='p') //purple path
            {
                System.out.println("Purple");
                //purple branches below
               System.out.println("You're trapped in a capsule at the\n"
                    + " bottom of the ocean.\n"
                    + "\n"
                    + "To open capsule, guess the 2 digit passcode.\n");
               
               int passcode;
               do{
                   System.out.println("Your number must be prime number between 23-31 \n");
                   passcode = kb.nextInt();
               } while(passcode > 2); //for now just enter 1, must create method in *separate* class 
               
                System.out.println("Now choose a direction [n/s/e/w] \n");
                
                //next step 
                //if else statements
                //by CW
        }
            else //by ER
            {
                lifeCount = lifeCount - 1;
                System.out.println("Red"); //red path
                System.out.println("You've descended into a bottomless void. Lose 1 life.\n");
                System.out.println("Go back to square one! \n");
                System.out.println("Life Count: " + lifeCount);
            }

    }
    
}
