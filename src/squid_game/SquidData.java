/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squid_game;

/**
 *
 * @author ElizabethReed PC
 */
public class SquidData {
    
     public static boolean isPrime(int passcode)
    {
        if(passcode < 3)
        {
            return(false);
        }
            
            for(int c=2; c < passcode; c++){
                if(passcode % c == 0) 
                {
                    return(false);
                }
            }
             return(true);
    }
    
}
