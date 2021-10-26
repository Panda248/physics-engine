package renderer;

import org.newdawn.slick.Graphics;
import physics.primitives.java.Circle;
import physics.primitives.java.Box;


public class Draw {
    Graphics g = new Graphics();
    public void drawBox(Box x)
    {
        g.drawRect(x.x,x.y,x.width,x.height);
    }
    public void drawEllipse(Circle x)
    {
        g.drawOval(x.x,x.y,x.radius*2, x.radius*2);
    }
}
