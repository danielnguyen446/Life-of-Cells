/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Stephen M Boussarov)
 * 
 * This file contains the CellDivide subclass of cell. This
 * concrete subclass is denoted by "+" on the petri dish.
 */

import java.util.*;

/**
 * This class derives from cell. It has two constructors and overrides the 
 * toString and checkApoptosis methods.
 */
public class CellDivide extends Cell 
{
    
    /**instance variable*/
    public int direction;    //which direction the cell will divide into
    
    /**
     * This constructor will call the parent class' constructor to initialize
     * the instance variables
     */
    public CellDivide(int currRow, int currCol, int mass)
    {
        super(currRow, currCol, mass);
        direction = 1;  //direction should be defaulted to 1
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellDivide(CellDivide otherCellDivide)
    {
        super(otherCellDivide);
        direction = otherCellDivide.direction;
    }
    
    /**
     * This method will return the string representation of the current object.
     * 
     * @return +
     */
    public String toString()
    {
        return "+";
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     * 
     */
    public boolean checkApoptosis(List<Cell> neighbors)
    {
        if(neighbors.size()==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
