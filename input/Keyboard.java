package input;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keyboard implements KeyListener {



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W://up
                System.out.println("W");
                break;
            case KeyEvent.VK_A://left
                System.out.println("A");
                break;
            case KeyEvent.VK_S://down
                System.out.println("S");
                break;
            case KeyEvent.VK_D://right
                System.out.println("D");
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}