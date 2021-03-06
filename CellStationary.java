/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Stephen M Boussarov)
 * 
 * This file contains the CellStationary subclass of cell. This
 * concrete subclass is denoted by "." on the petri dish.
 */

import java.util.*;

/**
 * This class derives from cell. It has two constructors and overrides the 
 * toString and checkApoptosis methods. 
 */
public class CellStationary extends Cell
{
    
    /**
     * This constructor will call the parent class' constructor to initialize
     * the instance variables
     */
    public CellStationary(int currRow, int currCol, int mass)
    {
        super(currRow, currCol, mass);
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellStationary(CellStationary otherCellStationary)
    {
        super(otherCellStationary);
    }
    
    /**
     * This method will return the string representation of the current object.
     * 
     * @return .
     */
    public String toString()
    {
        return ".";
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     */
    public boolean checkApoptosis(List<Cell> neighbors)
    {
        if(neighbors.size()<=7 && neighbors.size()>=3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
