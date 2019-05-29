import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int PIPE_SPACING = 150;
    int score = 0;
    int FIRST_PIPE = 240;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Set paint order
        setPaintOrder(Pipe.class, FlappyBird.class, GameOver.class);
        
        // Create a FlappyBird Object
        FlappyBird flappy = new FlappyBird();
        
        // Add flappy to our world
        addObject(flappy, 100, getHeight()/2);
    }
    
    public void act()
    {
        pipeCounter++;
        
        if (pipeCounter % 100 == 0)
        {
            createPipes(); 
        }
        if (pipeCounter >= FIRST_PIPE)
        {
            if (flappyCounter % 100 == 0)
           {
                score++;
                System.out.println(score);
           }
           flappyCounter++;
        }   
    }
    private void createPipes()
    {
        Pipe pipe = new Pipe();
        Pipe top = new Pipe();
        
        GreenfootImage image = pipe.getImage();
        GreenfootImage topPipe = top.getImage();
        
        addObject(pipe, getWidth(), getHeight() + Greenfoot.getRandomNumber(image.getHeight() -2));
        addObject(top, getWidth(), Greenfoot.getRandomNumber(image.getHeight()/10));
    }    
}
