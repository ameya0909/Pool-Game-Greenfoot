/**
 * Write a description of class Removed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Removed implements Pool 
{
    private PoolStick p;
    public Removed()
    {
    }

    public void doRemove()
    {
        
         //   getWorld().removeObject(p);
         PoolStick P = new PoolStick();
         P.getImage().setTransparency(0);
         
         System.out.println("RRRRRR");
    }
    
    public void doDisplay()
    {
        
         PoolStick P = new PoolStick();
         P.getImage().setTransparency(10);
         
    }
}
