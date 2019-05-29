import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bottompipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bottompipe extends Actor
{
    int PIPE_SPEED = -4;
    /**
     * Act - do whatever the Bottompipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation( getX() + PIPE_SPEED, getY() );
    }    
}
