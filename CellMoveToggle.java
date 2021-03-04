/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Stephen M Boussarov) 
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
        super(currRow, currCol, mass);
        toggled = true;  //toggled should be defaulted to true
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellMoveToggle(CellMoveToggle otherCellMoveToggle)
    {
        super(otherCellMoveToggle);
        toggled = otherCellMoveToggle.toggled;
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
    public boolean checkApoptosis(List<Cell> neighbors)
    {
        if(neighbors.size()<2 || neighbors.size()>5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
