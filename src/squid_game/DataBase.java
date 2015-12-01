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
public class DataBase {
    
    //by ER
    
    private SquidData[] dataArray = new SquidData[70];
    final int year;
    private int yearInput;
    private int yearInput2;
    private int index;
    private int missing[] = {
        30, 31, 42, 53, 44, 27, 13, 23, 34, 41,
        29, 22, 20, 17, 30, 30, 37, 26, 20, 31,
        32, 33, 31, 45, 40, 18, 54, 39, 34, 51,
        43, 59, 60, 32, 20, 12, 26, 16, 4, 37,
        52, 49, 48, 39, 55, 28, 40, 11, 13, 25,
        33, 44, 81, 89, 66, 67, 60, 41, 39, 70,
        70, 77, 67, 75, 47, 76, 26, 22, 45, 3,
        55, 61, 68, 45, 44, 58, 52, 18, 23, 72,
    };
    
    public DataBase()
    {
        year = 2550; //start year
    }
    
    //input dialog [enter year]
    public void yearInput(){
        yearInput = 0;
    }
    public void setYearInput(int yInput2){
        yearInput = yInput2;
    }
    public int getYearInput(){
        return(yearInput);
    }
    public void yearInput2(){
        yearInput2 = 0;
    }
    public void setYearInput2(int yInput2){
        yearInput2 = yInput2;
    }
    public int getYearInput2(){
        return(yearInput2);
    }
    
    //number of missing persons for a specified year
    public int getMissCount(){
        return(missing[getIndex()]);
    }
    public int getMissCount2(){
        return(missing[getIndex2()]);
    }
    
    //print out all data
    public String toString()
    {
        String result = "";
        String part = "";
        
        for (int c = 0; c < missing.length; ++c)
        {
            part = String.format("Year: %d Missing persons Count: %s\n" ,(2500 + c), missing[c]);
            result = result + part; //starts with result = nothing null
        }
        
        return(result);
    }
     public int getIndex(){
        return(getYearInput()-2500);
    }
     public int getIndex2(){
        return(getYearInput2()-2500);
    }
    public int compareY() //compare year1 and year2
    {
        return(getMissCount()-getMissCount2()); 
    }
    
    
}
