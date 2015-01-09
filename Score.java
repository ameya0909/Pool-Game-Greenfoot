import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
import java.awt.Graphics;
/**
 * Write a description of class ScoreOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends ScoreObserver
{
    
    private String text;
    private int stringLength;
    private static final Color textColor = new Color(255, 255, 255);
    
    public Score(PocketSubject pocket)
    {
        this.pocket=pocket;  
        this.pocket.attach(this);
    }
    
    public Score(String prefix)  
    {  
        text = prefix;  
        stringLength = (text.length() + 2) * 10;  
  
        setImage(new GreenfootImage(stringLength, 16));  
        GreenfootImage image = getImage();  
        image.setColor(textColor);  
  
        updateImage();  
    }  

    public void update() {
        PoolWorld.score++ ;
        PocketSubject.a=null;
    }
    
    private void updateImage()  
    {  
        GreenfootImage image = getImage();  
        image.clear();  
        image.drawString(text + PoolWorld.score, 1, 12);  
    }  
    
    /**
     * Act - do whatever the ScoreOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        updateImage();
    }    
}