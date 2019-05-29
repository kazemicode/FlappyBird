import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        // Create a FlappyBird Object
        FlappyBird flappy = new FlappyBird();
        
        // Add flappy to our world
        addObject(flappy, 100, getHeight()/2);
    }
    
    public void act()
    {
        counter++;
        if (counter == 100)
        {
            // Create a pipe object
            Pipe pippy = new Pipe();
            
            GreenfootImage image = pippy.getImage();
            
            addObject(pippy, getWidth(), getHeight()/2 + image.getHeight()-20);
            counter = 0;
        }    
    }    
}
