import java.util.ArrayList; // import the ArrayList class
/**
 * Write a description of class room here: This class will include the room name, secret path and a place for a weapon to be placed
 *
 * @author: Arya Diznabi
 * @version: 1.00
 */
public class room
{
    // instance variables - replace the example below with your own
    private String name;
    private room path;
    private ArrayList<player> occupants = new ArrayList<player>();
    private ArrayList<weaponCard> weapons = new ArrayList<weaponCard>();
    // private ArrayList<pieces> piecesInRoom = new ArrayList<pieces>();
    /**
     * Constructor for objects of class room
     */
    public room()
    {
        // initialise instance variables
        name = null;
        path = null;
        
    }

    public void setName (String x)
    {
        name = x;
    }
    
    public void setPath (room y)
    {
        path = y;
    }
    

    public String getname ()
    {
        return name;
    }
    
    public void enterRoom(player z)
    {
        boolean occupying = occupants.contains(z);
        if (occupying){
            System.out.println("This person is already in the room");
        }
        else {
            occupants.add(z);
        }
    }
    
    public void weaponInRoom(weaponCard b)
    {
        boolean weaponsinside = weapons.contains(b);
        if (weaponsinside){
            System.out.println("This weapon is already in the room");
        }
        else {
            occupants.add(b);
        }
    }
    
    public void leaveRoom(player c)
    {
        occupants.remove(c);
    }
    
    public void removeWeapon(weaponCard b )
    {
        weapons.remove(b);
    }
    
    public void useSecretPath(player c)
    {
        occupants.remove(c);
        path.enterRoom(c);
    }
}
