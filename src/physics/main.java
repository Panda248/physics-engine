package physics;

import org.newdawn.slick.*;
import physics.primitives.java.Box;
import physics.primitives.java.Circle;
import java.util.logging.Level;
import java.util.logging.Logger;
import physics.renderer.Draw;


public class main extends BasicGame
{
    private final Box x = new Box(100, 200, 50, 50);
    private final Circle y = new Circle();

    private Draw graphics = new Draw();

    public main(String gamename)
    {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {

    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        graphics.drawBox(x);

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