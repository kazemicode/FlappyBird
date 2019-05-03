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
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FlappyBird flappyBird = new FlappyBird();
        addObject(flappyBird,100, getHeight()/2);
    }
    
    public void act()
    {
        counter++;
        if (counter == 100) {
            //create a pipe object
            Pipe pipe = new Pipe();
            
            GreenfootImage image = pipe.getImage();
            
            addObject(pipe, getWidth(), getHeight()/2 + image.getHeight() - 20 );
            
        System.out.println(counter);
        counter = 0;

    }
    
   }   
}    
    