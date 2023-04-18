import java.awt.*;

public class Ball extends Rectangle {
    int xVelocity=1;
    int yVelocity=1;

    Ball(int x, int y,int width, int height)
    {
        super(x,y,width,height);
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);
        g.setColor(Color.yellow);
        g.drawLine(1000/2,0,1000/2,555);

    }
    public void move(){
        if(x>=1000)
        {
            xVelocity=-xVelocity;
        }
        if(x<0)
        {
            xVelocity=-xVelocity;
        }
        if(y>=555)
        {
            yVelocity=-yVelocity;
        }
        if(y<0)
        {
            yVelocity=-yVelocity;
        }
        x+=xVelocity;
        y+=yVelocity;
    }

}
