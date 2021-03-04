/** 
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: tutor help(Ashley Kou, Emma Yuan)
 * 
 * This file contains the class to display the petri dish that contains
 * all of the cells in the current iteration. Each space on the dish can 
 * contain either a living cell or an empty space.
 */

import java.util.*;

/**
 * This class contains methods to initialize and create the structure of the 
 * petri dish.
 */
public class PetriDish
{
    /** Instance variables*/
    public Cell[][] dish;   //represents the current iteration
    
    /**
     * This constructor initializes the board.
     */
    public PetriDish(String[][] board)
    {
        //iterate through the 2d array of strings by row and column
        for(int row=0; row<board.length; row++)
        {
            for(int column=0; column<board[row].length; column++)
            {
                //create a temporary string array called petri
                String[] petri = board[row][column].trim().split(" ");
                //petri will hold type and mass
                String CELL_TYPE = petri[0];
                int MASS = Integer.parseInt(petri[1]);
                
                //initialize the dish
                dish = new Cell[row][column];
                
                //create the dish depending on the class/type of cells
                if (CELL_TYPE.equals("null"))
                {
                    //edge case
                    continue;
                }
                if (CELL_TYPE.equals("CellMoveUp"))
                {
                    dish[row][column] = new CellMoveUp(row, column, MASS);
                }
                else if (CELL_TYPE.equals("CellStationary"))
                {
                    dish[row][column] = new CellStationary(row, column, MASS);
                }
                else if (CELL_TYPE.equals("CellDivide"))
                {
                    dish[row][column] = new CellDivide(row, column, MASS);
                }
                else if (CELL_TYPE.equals("CellMoveToggle"))
                {
                    dish[row][column] = new CellMoveToggle(row, column, MASS);
                }
                else if (CELL_TYPE.equals("CellMoveDiagonal"))
                {
                    dish[row][column] = new CellMoveDiagonal(row, 
                    column, MASS);
                }
                else if (CELL_TYPE.equals("CellMoveToggleChild"))
                {
                    dish[row][column] = new CellMoveToggleChild(row, 
                    column, MASS);
                }
            }
        }
    }
    
}
