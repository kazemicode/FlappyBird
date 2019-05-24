import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    int dy = -10;
    int g = 1;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX(), getY() + dy );
        
        // if user presses up arrow, launch flappybird upward
        if (Greenfoot.isKeyDown("up") == true) {
         dy = -10;
        }
        dy = dy + g;
        
        
    }    
}
