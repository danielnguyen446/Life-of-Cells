/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none 
 * 
 * This file contains the CellMoveToggle subclass of CellMoveUp. This
 * concrete subclass is denoted by "T" or "t" on the petri dish.
 */

import java.util.*;

/**
 * This class derives from CellMoveUp. It has two constructors and overrides the 
 * toString and checkApoptosis methods.
 */
public class CellMoveToggle extends CellMoveUp 
{
    
    /**instance variable*/
    public boolean toggled;
    
    /**
     * This constructor will call the parent class' constructor to initialize
     * the instance variables
     */
    public CellMoveToggle(int currRow, int currCol, int mass)
    {
        toggled = true;  //toggled should be defaulted to true
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellMoveToggle(CellMoveToggle otherCellMoveToggle)
    {
        
    }
    
    /**
     * This method will return the string representation of the current object.
     * 
     * @return T for true and t for false
     */
    public String toString()
    {
        if (toggled = true)
        {
            return "T";
        }
        else
        {
            return "t";
        }
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     */
    public abstract boolean checkApoptosis(List<Cell> neighbors);
    {
        int neighbors = 0;
        
        if(neighbors<2 || neighbors>5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
