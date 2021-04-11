import java.util.HashMap;
/**
 * Write a description of class board here.
 *
 * @ Arya
 * @ Version 1
 */
public class board
{
    // instance variables - replace the example below with your own
    HashMap<room, coordination> tiles = new HashMap<room, coordination>();

    /**
     * Constructor for objects of class board
     */
    public board()
    {
        // initialise instance variables
        ;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void genBoard()
    {
        // put your code here
        room x = new room();
        coordination y = new coordination();
        y.setterX(0);
        y.setterY(0);
        x.setName("room1");
        tiles.put(x, y);
    }
}
