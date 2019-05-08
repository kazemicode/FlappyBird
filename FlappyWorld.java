import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int counter = 0;

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        FlappyBird flappy = new FlappyBird();
        
        addObject(flappy, 100, getHeight()/2);
    }
    public void act()
    {
        counter++;
        if (counter == 100)
        {
           Pipe top = new TopPipe();
           Pipe bottom = new BottomPipe();
           // create top pipe and place it at the top
           GreenfootImage image = top.getImage();
           addObject(top, getWidth(), getHeight()/20);
           // create bottom pipe and place it at the bottom
           GreenfootImage bottomImage = bottom.getImage();
           addObject(bottom, getWidth(), getHeight());
           counter = 0;
        }
    }
}


