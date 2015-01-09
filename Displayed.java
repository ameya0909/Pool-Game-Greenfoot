/**
 * Write a description of class Displayed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Displayed implements Pool  
{
    
    
    public void doDisplay(){
         
         PoolStick P = new PoolStick();
         P.getImage().setTransparency(10);
         
         
    }
    
    public void doRemove(){
       
        PoolStick P = new PoolStick(); 
        P.getImage().setTransparency(0);    
            
    }

    
}
