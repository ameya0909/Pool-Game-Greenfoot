import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class PocketSubject extends Actor
{
    private int radius;
    private ArrayList<ScoreObserver> observers = new ArrayList<ScoreObserver>() ;
    private List<Actor> balls = new ArrayList<Actor>() ;
    private String ballColour;
    private String str;
    public static Actor a;
    public PocketSubject(int radius)
    {
        this.radius = radius;
        GreenfootImage circle = new GreenfootImage(2*radius, 2*radius);
        circle.setColor(java.awt.Color.BLACK);
        circle.fillOval(0, 0, 2*radius, 2*radius);
        setImage(circle);
    }

       public PocketSubject()
    {
    }

    public String getState() 
    {
        return ballColour ;
    }

    public void setState() {
        // ballColour = colour ;
        notifyObservers();
    }

    public void attach(ScoreObserver obj) {
        observers.add(obj) ;
    }

    public void detach(ScoreObserver obj) {
        observers.remove(obj) ;
    }

    public void notifyObservers() {
        for (ScoreObserver obj  : observers)
        {
            obj.update();
        }
    }

    public void act() 
    {  //balls = getIntersectingObjects( Ball.class ) ;
        for (Ball b : (java.util.List<Ball>)getWorld().getObjects(Ball.class))
        {
            if (Math.hypot(b.getX() - getX(), b.getY() - getY()) <= radius)
            {
                PoolWorld.ctr++;
                str = (b.getClass().getName());
                // System.out.println(str);
                World world = getWorld();
                world.removeObject(b);
                if(str!="BlackBall" && str!="WhiteBall")
                {
                    setState();                
                    //System.out.println(PoolWorld.ctr);
                }

                else if(str=="BlackBall" && PoolWorld.ctr==15)
                {
                    setState();
                    GameOver gameOver = new GameOver();
                    world.addObject(gameOver, world.getWidth()/2, world.getHeight()/2);
                    Greenfoot.stop();
                }

                else
                {
                    GameOver gameOver = new GameOver();
                    world.addObject(gameOver, world.getWidth()/2, world.getHeight()/2);
                    Greenfoot.stop();
                }
            }

        }
    }
}
