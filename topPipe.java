import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class topPipe extends Pipe
{
    int pipeSpeed = -6;
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation(getX() + pipeSpeed, getY() );
    }    
}
