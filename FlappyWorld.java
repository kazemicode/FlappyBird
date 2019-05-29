import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter =0;
    int score = 0;
    int FIRST_PIPE = 240;
    int flappyCounter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        setPaintOrder(Pipe.class, FlappyBird.class, GameOver.class);

        FlappyBird flappy = new FlappyBird();
        addObject(flappy,100,getHeight()/2);
        prepare();
        
        Score score = new Score();
        
        addObject(score, 100, 100);
        
    }

    public void act(){

        pipeCounter++;
        
        if(pipeCounter % 100 == 0){
            createPipes();
        }
   
        if(pipeCounter >= FIRST_PIPE){
           if(flappyCounter % 100 == 0){
           score++;
           System.out.println(score);
        
        }
         flappyCounter++;
    }
}
    public void createPipes(){
       Pipe pipe = new Pipe();
       Pipe top = new TopPipe();

       GreenfootImage image = pipe.getImage();   
       GreenfootImage topPipe = top.getImage();

      addObject(pipe, getWidth(), getHeight() + Greenfoot.getRandomNumber(image.getHeight()-2));
            
      addObject(top, getWidth(), Greenfoot.getRandomNumber(image.getHeight()/10));
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}