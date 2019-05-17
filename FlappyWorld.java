import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
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
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
        
        setPaintOrder(Pipe.class, FlappyBird.class, GameOver.class);
        
        
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
    public void act() {
        pipeCounter++;
        
        if (pipeCounter % 100 == 0) {
            createPipes();
        }  
        
        
        if (pipeCounter >= FIRST_PIPE) {
            if (flappyCounter % 100 == 0) {
                score++;
                System.out.println(score);
            }
            flappyCounter++;
        }
    }
    private void createPipes() {
            Pipe topPipe = new Pipe();
            Pipe botPipe = new Pipe();
            
            GreenfootImage image = botPipe.getImage();
            addObject(botPipe, getWidth(), getHeight()/2 + image.getHeight() - Greenfoot.getRandomNumber(200));
            addObject(topPipe, getWidth(), botPipe.getY() - image.getHeight() - PIPE_SPACING);
            
    }

}
