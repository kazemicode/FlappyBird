import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = -20;
    double g = 2;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY() + dy));
        
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = -15;
        }
        dy = dy + g;
        
        if(this.getY() > 400)
        {
            System.out.println("Game over!");
            Greenfoot.stop();
        
        }
    }    
}
