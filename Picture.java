
/**
 * Write a description of class Picture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Circle sun;
    private Circle grass;
    private Person dad;
    private Person kid;
    private int[][] sunTrajectory = { {275, 50}, {175, 50}, {75, 150}, {0,300} };
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Circle(40, 375, 100, "yellow");
        grass = new Circle(3000, -1250, 225, "green");
        dad = new Person(66, 33, 275, 180, "black");
        kid = new Person(44, 25, 305, 200, "black");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawPicture()
    {
        sun.setPos(375, 100);
        
        grass.makeVisible();
        sun.makeVisible();
        dad.makeVisible();
        kid.makeVisible();
    }
    
    public void sunset(){
        sun.moveSun(sunTrajectory);
        
        kid.slowMoveHorizontal(30);
        dad.slowMoveHorizontal(30);
    }
}
