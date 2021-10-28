package physics;

import org.newdawn.slick.*;
import physics.primitives.java.Box;
import physics.primitives.java.Circle;
import renderer.Move;
import renderer.Draw;

import java.util.logging.Level;
import java.util.logging.Logger;



public class main extends BasicGame
{
    private Draw graphics = new Draw();
    private Move drip = new Move();
    private Box x = new Box();
    private Circle y = new Circle();

    public main(String gamename)
    {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {

    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        x.setXVel(x.getAccel());
        x.setAccel(x.getAccel()+(x.getAccel()*.06f));

    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        graphics.drawBox(x);
        graphics.drawEllipse(y);
        drip.shiftBox(x, x.getXVel(), x.getYVel());
    }

    public static void main(String[] args)
    {
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new main("Physics Engine"));
            appgc.setDisplayMode(640, 480, false);
            appgc.setTargetFrameRate(60);
            appgc.start();

        }
        catch (SlickException ex)
        {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}