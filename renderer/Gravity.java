package renderer;
import physics.primitives.java.*;

public class Gravity {
    private float accel = 1.2f;

    public void gravBox(Box box)
    {
        box.setYAccel(box.getYAccel()*accel);
    }
}
