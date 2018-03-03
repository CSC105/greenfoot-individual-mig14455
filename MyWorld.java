import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    { 

        super(900, 432, 1); 
        MainAIFlamingo mainFamin = new MainAIFlamingo();
        addObject(mainFamin,702,314);
        Flamingo Flamin = new Flamingo();
        addObject(Flamin,31,375);
        CLICKHERE Click= new CLICKHERE();
        addObject(Click, 618, 170);
        Clickme Ck= new Clickme();
        addObject(Ck, 801, 211);
        name name = new name();
        addObject(name,240,79);
    }
}