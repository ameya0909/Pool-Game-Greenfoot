import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PoolStick extends Actor
{
    /**
     * Act - do whatever the Stick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Pool displayState;
    Pool removeState;
    Pool currentState;
    private PoolStick ps;
    
    public void act() 
    {
        // Add your action code here.
        
      
         //int transparency = 0;
         //if(Greenfoot.mousePressed(null)){
           //  getWorld().removeObject(PS);
           // this.getImage().setTransparency(transparency);    
            //}
            //else
            //{
             //   getWorld().addObject(PS , 0 , 300);
            //}
            
            
        //}
    }
    
    
    
    public void Poolstick()
    {
        displayState = new Displayed();
        removeState = new Removed();
        
        //currentState = displayState;
    }
    
    public void doDisplay()
    {
        //int transparency = 10;
        // ps = new PoolStick();
        // getWorld().addObject(ps, 0, 300);
         //this.getImage().setTransparency(transparency);
        currentState.doDisplay();
    }
    
    public void doRemove()
    {
        System.out.println("Removing");
        //Greenfoot.delay(100);
         //int transparency = 0;
         
         //this.getImage().setTransparency(transparency);
         
         // getWorld().removeObject(ps);
         
        currentState.doRemove();
    }
    
    void setState(int nextState) {
        switch( nextState ) {
            case 1 :    currentState = removeState ;doRemove(); break ;
            case 2 :    currentState = displayState ;doDisplay(); break ;
        }

      }
  }


