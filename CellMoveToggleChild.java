/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none 
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

    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellMoveToggleChild(CellMoveToggleChild otherCCellMoveToggleChild)
    {
        
    }
    
  
    /**
     * This method will return the string representation of the current object.
     */
    public String toString()
    {
        //does not override CellMoveToggle's toString method
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     */
    public abstract boolean checkApoptosis(List<Cell> neighbors);
    {
        int neighbors = 0;        
        
        /** 
         * Override apoptosis() to not only call its parent's apoptosis() 
         * method but to also decrement numAlive by 1.
         */
        if((neighbors<2 || neighbors>5)) //&& CellMoveToggleChilds alive<10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
