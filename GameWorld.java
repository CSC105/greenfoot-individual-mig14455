import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    private PinkLivesCounter PinkLivesCounter;
    private LivesCounter LivesCounter;
    public GameWorld()
    { 

        super(900, 432, 1); 
                Flamingo Flamin = new Flamingo();
        YellowFlamingo yellowFamin = new YellowFlamingo();
        LivesCounter LivesCounter = new LivesCounter();
        PinkLivesCounter PinkLivesCounter = new PinkLivesCounter();
        picturePink picturePink = new picturePink();
        pictureYellow pictureYellow = new pictureYellow();
        Blocks blocks = new Blocks();
        Blocks blocks3 = new Blocks();
        addObject(blocks,259,330);
        addObject(blocks3,630,330);
        addObject(Flamin,31,375);
        addObject(yellowFamin,875,375);
        addObject(pictureYellow,810,30);
        addObject(LivesCounter,840,30);
        addObject(picturePink,50,30);
        addObject(PinkLivesCounter,80,30);
        addObject(blocks,259,330);
        addObject(blocks3,630,330);
    }

    public LivesCounter LivesCounter(){
        return LivesCounter;
    }
    
    public PinkLivesCounter PinkLivesCounter(){
        return PinkLivesCounter;
    }
    /*public void prepare(){
    //LivesCounter LivesCounter = new LivesCounter();
    int temp = 0;
    //int pinkLives = getObjects(Flamingo.class).get(0).getLives();
    int pinkLives = getObjects(Flamingo.class).get(0).getLives();
    int yellowLives = getObjects(YellowFlamingo.class).get(0).getLives();
    System.out.println("Now Yellow::" + yellowLives);

    for (int i=0; i< yellowLives ; i++){
    LivesCounter LivesCounter = new LivesCounter();
    addObject(LivesCounter,50+temp,50);
    temp += 30;
    }

    }*/
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
