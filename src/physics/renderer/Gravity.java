package physics.renderer;
import physics.primitives.java.*;

public class Gravity {
    private final float accel = 1.2f;

    public void gravBox(Box box)
    {
        box.setYAccel(box.getYAccel()*accel);
    }
}