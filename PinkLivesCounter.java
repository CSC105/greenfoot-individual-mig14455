import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkLivesCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkLivesCounter extends Actor
{

    //int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();

    public PinkLivesCounter(){
        //GreenfootImage img = getImage();
        //int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
        //GreenfootImage[] pinkImage = new GreenfootImage[pinkLives];
        GreenfootImage image = new GreenfootImage("pinkLives.png");
        image.scale(25,20);
        setImage(image);

        //setImage(img);
    }

    public void act() 
    {
        int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
        setImage(new GreenfootImage("X " + pinkLives, 24, Color.BLACK, Color.WHITE));
    }    

    public void livesCount(){
        /*int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
        int yellowLives = getWorld().getObjects(YellowFlamingo.class).get(0).getLives();
        System.out.println("Now Yellow::" + yellowLives);*/

    }
}
