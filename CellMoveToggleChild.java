/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Stephen M Boussarov)
 * 
 * This file contains the CellMoveToggleChild subclass of CellMoveToggle.
 */

import java.util.*;


/**
 * This class derives from CellMoveToggle. It has two constructors 
 * and overrides the checkApoptosis method.
 */
public class CellMoveToggleChild extends CellMoveToggle
{
    /**instance variables*/
    public static int numAlive;  //instances of this cell type currently alive
    
    /**
     * This constructor will call the parent class' constructor to initialize
     * the instance variables. It will also increment numAlive by 1
     */
    public CellMoveToggleChild(int currRow, int currCol, int mass)
    {
        super(currRow, currCol, mass);
        numAlive+=1;
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellMoveToggleChild(CellMoveToggleChild otherCCellMoveToggleChild)
    {
        super(otherCCellMoveToggleChild);
        numAlive = otherCCellMoveToggleChild.numAlive;
    }
    
  
    /**
     * This method will return the string representation of the current object.
     */
    public String toString()
    {
        //does not override CellMoveToggle's toString
        if (toggled = true)
        {
            return "T";
        }
        else
        {
            return "t";
        }
    }
    
    public void apoptosis()
    {
        super.apoptosis();
        numAlive = numAlive-1;
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     */
    public boolean checkApoptosis(List<Cell> neighbors)
    {
        /** 
         * Override apoptosis() to not only call its parent's apoptosis() 
         * method but to also decrement numAlive by 1.
         */
        if((neighbors.size()<2 || neighbors.size()>5) && numAlive<10)
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
}
