import javax.swing.*;
import java.awt.*;

public class PongGame extends JFrame {
    PongPanel panel;
    PongGame()
    {
        panel=new PongPanel();
        this.setBackground(Color.black);
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new PongGame();
    }
}
