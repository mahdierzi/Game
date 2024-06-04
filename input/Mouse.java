package input;

import java.awt.event.*;

public class Mouse implements MouseMotionListener,MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse click");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse moved");
    }


}
