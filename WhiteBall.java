import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class WhiteBall extends SolidBall
{
    int radius = 25;
    protected Ball decoratedBall;
    public WhiteBall()
    {
    }



    public Color draw()
    {
        Color c = new Color(255, 255, 255);
        GreenfootImage img = new GreenfootImage(radius * 2 + 1, radius * 2 + 1);
        img.setColor(c);
        img.fillOval(0, 0, 2*radius, 2*radius);
        setImage(img);
        return null;
    }

    public void act() 
    {
        super.act();
        PoolStick PS = new PoolStick();
        int x = 0;
        int y = 0;
        
        MouseInfo info = Greenfoot.getMouseInfo();
        
        if (info != null && Greenfoot.mouseClicked(null))
        {
            x = getX();
            y = getY();
            getWorld().addObject(PS, x - 244, y);
            Greenfoot.delay(50);
            double angle = Math.atan2(info.getY() - getY(), info.getX() - getX());
            double cueSpeed = 15;
            setMove(Math.cos(angle) * cueSpeed, Math.sin(angle) * cueSpeed);
            getWorld().removeObject(PS);
        }
        
        
    }
    
        public int getRadius()
    {
       return radius;
    }


}
