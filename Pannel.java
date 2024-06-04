
import input.Keyboard;
import input.Mouse;

import javax.swing.*;
import java.awt.*;

public class Pannel extends JPanel {
    private Mouse mouse;
    private int xdelta=0,ydelta=0;
    public Pannel() {
        mouse=new Mouse();
        addKeyListener(new Keyboard());
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }


    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(100+xdelta,100+ydelta,200,50);

    }
}
