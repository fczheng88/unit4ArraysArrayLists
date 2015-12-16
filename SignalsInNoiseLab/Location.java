
/**
 * Stores a location as row, col
 * 
 * @author Felix Zheng 
 * @version 16 Dec 2015
 */
public class Location
{
    // instance variables - replace the example below with your own
    public int row;
    public int col;

    /**
     * Constructor for objects of class Location
     */
    public Location(int row, int col)
    {
        this.row=row;
        this.col=col;
    }

    /**
     * Returns the row
     * 
     * @return   int  row 
     */
    public int row()
    {
        // put your code here
        return row;
    }
    /**
     * Returns the col
     * 
     * @return int col
     */
    public int col()
    {
        return col;
    }
    public String toString()
    {
        return "Row: "+row+"; Column: "+col;
    }
}
