package physics.primitives.java;

import org.newdawn.slick.Input;

public class Controller {

    private static float xDisp = 10f;
    private static float yDisp = 10f;

    public static void controlBox(Box box, Input input)
    {
        if(input.isKeyDown(Input.KEY_W))
        {
            box.setY(box.getY() - yDisp);
        }
        if(input.isKeyDown(Input.KEY_D))
        {
            box.setX(box.getX()+xDisp);
        }
        if(input.isKeyDown(Input.KEY_A))
        {
            box.setX(box.getX()-xDisp);
        }
        if(input.isKeyDown(Input.KEY_S))
        {
            box.setY(box.getY() + yDisp);
        }
    }

}
