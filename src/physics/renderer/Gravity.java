package renderer;
import physics.primitives.java.*;

public class Gravity {
    private final float gravityAccel = 0.01f;
    private  float gravSpeed = 0;
    private float terminalVel = 10f;
    public void gravBox(Box box)
    {
        if(box.getYVel() < terminalVel)
        {
            this.gravSpeed+=gravityAccel;
            box.setYVel(box.getYVel()+gravSpeed);
        }
    }
    public void gravCircle(Circle circle)
    {
        if(circle.getYVel() < terminalVel)
        {
            this.gravSpeed+=gravityAccel;
            circle.setYAccel(circle.getYAccel() + gravSpeed);
        }
    }
}
