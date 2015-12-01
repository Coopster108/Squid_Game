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
        int lifeCount; 
        lifeCount = 5;
        
        
        
        String color;
        Scanner kb = new Scanner(System.in);
        System.out.println("You are Squidward Tenticals stuck\n"
                + "in the future. You've arrived in an\n"
                + "empty room with virtual\n"
                + "transportation squares.");
                
        do{//restart for drops through the whole game
                System.out.println("\nLives: "
                + lifeCount
                + "\nChoose a square\n"
                + "\n"
                + "[red, blue, green purple]");
        
    color = kb.next();
    
    //********************************BLUE**************************************
    
    if(color.charAt(0)=='b') //**BLUE** path
    {
        System.out.println("\nBlue");
        //blue branches below
            System.out.println("You've been ejected into space. You're moving at dangerous speeds. Slow down!\n");
            
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
        } while(ans.charAt(0) != 'y'&& lifeCount > 0);
        
        if(ans.charAt(0)== 'y')//next step
        {
            do
            {
                System.out.println("\nWill you dive deeper or shallower?");
                ans = kb.next();
                
                 if(ans.charAt(0) != 'd' && ans.charAt(0) != 's')
            {
                System.out.println("Pick one!");
            }
                
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
            } while(ans.charAt(0) != 's' && lifeCount > 0);
            
            if(ans.charAt(0)== 's')//next step 
            {
                do
                {
                        System.out.println("\nA submarine approaches you. Would you like to become a stowaway?");
                    ans = kb.next();
                    if(ans.charAt(0)== 'y')
                    {
                        System.out.println("\nCongrats! You made it safely back to Bikini Bottom with: " + lifeCount + " lives!");
                        System.exit(0);//so it doesnt fall through to restart
                    }
                    else
                        if(ans.charAt(0)== 'n')
                    {
                        System.out.println("You get lost in the dark ocean & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);
                        
                        if(lifeCount == 0)//game over & 0 lives
                        {
                            System.out.println("--You died! Game Over--");
                        }
                    }
                }while(ans.charAt(0)!= 'y'&& lifeCount > 0);
                
            }
            
        }

    }
        
    //***********************************GREEN***********************************
    
    else //by ER
        if(color.charAt(0)=='g') //**GREEN** path
        {
            System.out.println("\nGreen");
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
                
                    if(year >= 2500 && year <= 2600)
                    {
                    String ans2;
                    System.out.println("\nYou're not the first one to get lost in this year. "
                            + "\nYou have been entered into the missing person's catalog.");
                    System.out.println("\"sorting data\" blah blah yearss........");
                    System.out.println("\nEnter a distress signal: ");
                    ans2 = kb.next();
                    System.out.println("\nYour distress signal was picked up by a freindly pirate!");
                    System.out.println("\nCongrats! You made it safely back to Bikini Bottom with: " + lifeCount + " lives!");
                    
                    System.exit(0);//so it doesnt fall through to restart
                    }
            } while(year < 2500 || year > 2600 && lifeCount > 0);
            
            //next step
            //these steps require methods in separate classes, just do sout-tabs containing the info, I'll modify them later
            //by CW
            
        }
        
        //********************************PURPLE********************************
        
        else    //by ER
            if(color.charAt(0)=='p') //**PURPLE** path
            {
                System.out.println("\nPurple");
                //purple branches below
               System.out.println("You're trapped in a capsule at the\n"
                    + " bottom of the ocean.\n"
                    + "\n"
                    + "To open capsule, guess the 2 digit passcode.\n");
               
               int passcode;
               do{
                   System.out.println("Your number must be prime number between 23-31 \n");
                   passcode = kb.nextInt();
               } while(SquidData.isPrime(passcode) == false || passcode > 31 || passcode < 23); 
               
               String dir;
               do{ //next step
                System.out.println("\nNow choose a direction [n/s/e/w]");
                dir = kb.next();
                
                //by CTW
                
                String ans3;
                if(dir.charAt(0) == 's') //SOUTH
                {
                    do{
                    System.out.println("\nYou've been caught by a fishnet!");
                    System.out.println("\nDo you try to escape?"); //next step
                    ans3 = kb.next();
                    if(ans3.charAt(0) == 'y')
                    {
                        System.out.println("\nYou're strangled & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);
                    }
                    else
                        if(ans3.charAt(0) == 'n')
                    {
                        System.out.println("\nYou're turned into Sushi & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);
                    }
                    }while(ans3.charAt(0) != 'y' && ans3.charAt(0) != 'n');
                }
                
                if(dir.charAt(0) == 'w') //WEST
                {
                    do{
                    System.out.println("\nWould you like to eat radio-active algae or braised plankton?");
                    ans3 = kb.next();
                    if(ans3.charAt(0)== 'b')
                    {
                        System.out.println("You are poisioned & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);
                    }
                    
                    else
                        if(ans3.charAt(0) == 'r')
                    {
                        System.out.println("\nYou gained a life & evoled into buff squid!");
                        ++lifeCount;
                        System.out.println("Lives: " + lifeCount);
                        
                        String ans;
                        
                        do
                        {
                        System.out.println("\nA submarine approaches you. Would you like to become a stowaway?");
                        ans = kb.next();
                        if(ans.charAt(0)== 'y')
                        {
                        System.out.println("\nCongrats! You made it safely back to Bikini Bottom with: " + lifeCount + " lives!");
                        System.exit(0);//so it doesnt fall through to restart
                        }
                        
                        else
                            if(ans.charAt(0)== 'n')
                        {
                        System.out.println("You get lost in the dark ocean & lose a life!");
                        --lifeCount;
                        System.out.println("Lives: " + lifeCount);

                        if(lifeCount == 0)//game over & 0 lives
                            {
                                System.out.println("--You died! Game Over--");
                            }
                        }
                        
                        }while(ans.charAt(0)!= 'y' && lifeCount > 0);
                    }
                    
                    }while(ans3.charAt(0) != 'r' && lifeCount > 0);
                    
                    
                }
                
                if(dir.charAt(0) == 'e')//EAST
                {
                    System.out.println("\nYou've been attacked by sharks & lose a life!");
                    --lifeCount;
                    System.out.println("Lives: " + lifeCount);
                }
                
                if(dir.charAt(0) == 'n')//NORTH
                {
                    System.out.println("You've been attacked by zombie pinapples & lose a life!");
                    --lifeCount;
                    System.out.println("Lives: " + lifeCount);
                }
               }while(dir.charAt(0) != 'w' 
                       && lifeCount > 0); //no n,e,s as it always loops to direction again
                //next step 
                //if else statements
                //by CW
                
                
        }
            
     //********************************RED**************************************       
            
    else //by ER
            {
                if(color.charAt(0)=='r'){
                --lifeCount;
                System.out.println("\nRed"); //**RED** path
                System.out.println("You've descended into a bottomless void. Lose 1 life.\n");
                System.out.println("Go back to square one!");}
            }
    
    }while(lifeCount > 0);//added a restart for full drops through the game
      
        if(lifeCount == 0)
        {
            System.out.println("\nLives: " + lifeCount);
            System.out.println("You lose!");
        }
    }
    
}
