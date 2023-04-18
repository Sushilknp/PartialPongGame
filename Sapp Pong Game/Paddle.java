import java.awt.*;

public class Paddle extends Rectangle {
    int id;
    Paddle(int x, int y, int Width, int Height,int id)
    {
        super(x,y,Width,Height);
        this.id=id;

    }
    public void draw(Graphics g)
    {
        if(id==1)
        {
            g.setColor(Color.red);
        }
        else {
            g.setColor(Color.blue);
        }
        g.fillRect(x,y,width,height);

    }
}
