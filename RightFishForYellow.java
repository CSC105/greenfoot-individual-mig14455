import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightFishForPink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightFishForYellow extends Actor
{
    private int speed = 4;

    public RightFishForYellow(){
        GreenfootImage img = getImage();
        img.scale(25,20);
        setImage(img);
        int speed = 4;
        img.mirrorHorizontally();

    }

    public void setSpeed(int s){
        speed = s;
    }

    public int getSpeed(){
        return speed;
    }

    public void act(){
        /* if (!getWorld().getObjects(Flamingo.class).isEmpty()) {
        flamingoDirection = getWorld().getObjects(Flamingo.class).get(0).getDirection();
        //System.out.println("Direction is" + flamingoDirection);
        }*/

        move(speed);
        if(theHitEdge()){
            World w = getWorld();
            w.removeObject(this);
        }

        /*if(theHitEdge()){
        World w = getWorld();
        w.removeObject(this);
        }*/

    }

    public boolean theHitEdge(){
        World w = getWorld();
        int width = w.getWidth();
        int height = w.getHeight();

        int positionX = getImage().getWidth();
        int positionY = getImage().getHeight();
        if(getX() + positionX/2 > width){
            return true;
        }else if(getX() - positionX/2 < 0){
            return true;
        }else if(getY() + positionY/2 >= height){
            return true;
        }else if(getY() + positionY/2 <= 0){
            return true;
        }else{
            return false;
        }
    }

    /*public boolean hitItem(){
        int x = getWorld().getObjects(YellowFlamingo.class).get(0).getX();
        int y = getWorld().getObjects(YellowFlamingo.class).get(0).getY();

        if(getX() >= x-10 && getX() <= x+10){
            if(getY() <= y+10 && getY() >= y-10){
                return true;
            }
            else { return false; }
        } else{
            return false;
        }
     

    }*/
   

}
