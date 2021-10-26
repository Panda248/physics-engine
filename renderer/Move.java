package renderer;

import physics.primitives.java.Box;
import physics.primitives.java.Circle;

public class Move {


   public void shiftBox(Box x, float xShift, float yShift)
    {
        x.x+=xShift;
        x.y+=yShift;
    }
    public void shiftEllipse(Circle x, int xShift, int yShift)
    {
        x.x+=xShift;
        x.y+=yShift;
    }


}
