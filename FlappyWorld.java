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
        
        FlappyBird flappy = new FlappyBird();
        
        addObject(flappy, 100, getHeight()/2);
    }
    public void act () {
      counter ++;
     if (counter == 100 ) {
        pipe Pippy = new pipe();
        GreenfootImage image = Pippy.getImage();
        addObject(Pippy, getWidth(), getHeight()/2 + image.getHeight()/2);
        System.out.println(counter);
        counter = 0;
    }
    }
}
