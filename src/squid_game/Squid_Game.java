/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squid_game;

import java.util.Scanner;

/**
 *
 * @author cooperwhittemore & ereed
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
    
    if(color.charAt(0)=='b') //**BLUE** path
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
            } while(speed >= 2500 && lifeCount > 0);
        
        //by CW
        String ans;
        do
        {
            System.out.println("\nYou're marooned on planet Zorg! Would you like an oxygen tank?\n");
            ans = kb.next();
            
            if(ans.charAt(0)== 'n')
            {
                System.out.println("\nOh no you're out of breath & lost a life!");
                --lifeCount;
                System.out.println("Life:" + lifeCount);
                
                if(lifeCount == 0)//game over & 0 lives
                    {
                        System.out.println("--You died! Game Over--");
                    }
            }
        } while(ans.charAt(0) == 'n'&& lifeCount > 0);
        
        if(ans.charAt(0)== 'y')//next step
        {
            do
            {
                System.out.println("\nWill you dive deeper or shallower?");
                ans = kb.next();
                if(ans.charAt(0)== 'd')
                {
                    System.out.println("\nYour brains exploded & you lost a life!");
                    --lifeCount;
                    System.out.println("Life:" + lifeCount);
                    
                    if(lifeCount == 0)//game over & 0 lives
                        {
                            System.out.println("--You died! Game Over--");
                        }
                }
            } while(ans.charAt(0) == 'd'&& lifeCount > 0);
            
            if(ans.charAt(0)== 's')//next step 
            {
                do
                {
                        System.out.println("\nA submarine approaches you. Would you like to become a stowaway?");
                    ans = kb.next();
                    if(ans.charAt(0)== 'y')
                    {
                        System.out.println("\n\nCongrats! You made it safely back to Bikini Bottom with: " + lifeCount + " lives!");
                    }
                    else
                    {
                        System.out.println("You get lost in the dark ocean & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);
                        
                        if(lifeCount == 0)//game over & 0 lives
                        {
                            System.out.println("--You died! Game Over--");
                        }
                    }
                }while(ans.charAt(0)== 'n'&& lifeCount > 0);
                
            }
            
        }
        
        else
        {
            System.exit(0);
            //i think i need a for loop here to repeat the question if they dont give the correct answer
            //to be fixed later
            
            //... unless it doesnt matter bc this is a text version of what were doing...
            
        }

    }
        
    else //by ER
        if(color.charAt(0)=='g') //**GREEN** path
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
                
                    if(year > 2500 && year < 2600)
                    {
                    String ans2;
                    System.out.println("\nYou're not the first one to get lost in this year. "
                            + "\nYou have been entered into the missing person's catalog.");
                    System.out.println("\"sorting data\" blah blah yearss........");
                    System.out.println("\nEnter a distress signal: ");
                    ans2 = kb.next();
                    System.out.println("\nYour distress signal was picked up by a freindly pirate!");
                    System.out.println("\n\nCongrats! You made it safely back to Bikini Bottom with: " + lifeCount + " lives!");
                    
                    }
            } while(year < 2500 || year > 2600);
            
            //next step
            //these steps require methods in separate classes, just do sout-tabs containing the info, I'll modify them later
            //by CW
            
            
            
        }
        else    //by ER
            if(color.charAt(0)=='p') //**PURPLE** path
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
                System.out.println("Red"); //**RED** path
                System.out.println("You've descended into a bottomless void. Lose 1 life.\n");
                System.out.println("Go back to square one! \n");
                System.out.println("Life Count: " + lifeCount);
            }
    }
    
}
