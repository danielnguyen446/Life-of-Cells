/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Stephen M Boussarov)
 * 
 * This file contains the CellMoveDiagonal subclass of CellMoveUp. This
 * concrete subclass is denoted by "/"  or "\" on the petri dish. 
 */

import java.util.*;

/**
 * This class derives from CellMoveUp. It has two constructors and overrides the 
 * toString and checkApoptosis methods.
 */
public class CellMoveDiagonal extends CellMoveUp 
{
    
    /** instance variables*/
    public boolean orientedRight;   //true is right orientation, false is left
    public int diagonalMoves;    //count the number of moves made
    
    /**
     * This constructor will call the parent class' constructor to initialize
     * the instance variables
     */
    public CellMoveDiagonal(int currRow, int currCol, int mass)
    {
        super(currRow, currCol, mass);
        orientedRight = true;   //orientedRight should be defaulted to true
        diagonalMoves = 0;  //diagonalMoves should be defaulted to 0
    }
    
    /**
     * This copy constructor will call the parent class' copy constructor
     * to initialize the instance variables
     */
    public CellMoveDiagonal(CellMoveDiagonal otherCellMoveDiagonal)
    {
        super(otherCellMoveDiagonal);
        orientedRight = otherCellMoveDiagonal.orientedRight;
        diagonalMoves = otherCellMoveDiagonal.diagonalMoves;
    }
    
    /**
     * This method will return the string representation of the current object.
     * 
     * @return / if oriented right. \ if oriented left
     */
    public String toString()
    {
        if (orientedRight == true)
        {
            return "/";
        }
        else
        {
            return "\\";
        }
    }
    
    /**
     * This method checks if the cell should initiate apoptosis or not by 
     * determining the number of neighbors the cell has.
     */
    public boolean checkApoptosis(List<Cell> neighbors)
    {
        if(neighbors.size()>3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
