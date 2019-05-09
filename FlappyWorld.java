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
    int score = 0;  
    int FIRST_PIPE = 230;
    int flappyCounter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
        //set paint order
        setPaintOrder(Pipe.class,FlappyBird.class, GameOver.class);
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
        pipeCounter++;
        if (pipeCounter % 100 == 0) {
            //create a pipe object
            Pipe pipe = new PipeDown(); 
            Pipe pipeup = new Pipeup();
            
            GreenfootImage image = pipe.getImage();
            GreenfootImage image2 = pipeup.getImage();
            
            addObject(pipe, getWidth(), getHeight()/2 + image2.getHeight() - 100 );
            addObject(pipeup, getWidth(), getHeight()/2 + image2.getHeight()  - 500);
            
                //           System.out.println(counter);
            

    }
    
    
    if (pipeCounter >= FIRST_PIPE) {
        if (flappyCounter % 100 == 0) {
            score++;
            System.out.println(score);
        }
        flappyCounter++;
        }    
     }  
  
}