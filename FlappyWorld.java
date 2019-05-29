
import greenfoot.*;

/**
 * Write a description of class FlappyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int counter = 0;
    

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class FlappyWorld.
     */
    public FlappyWorld()
    {
        super(500, 400, 1, false);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 100, getHeight()/2);
        
        
    }
    
    public void act()  { 
           counter++;
           
           if (counter % 100 == 0)  { 
               Bottompipe pippy = new Bottompipe();
               
               addObject(pippy, getWidth(), getHeight());
           //System.out.println(counter);
           counter = 0;
    } 
}
}
