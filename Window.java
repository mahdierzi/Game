

import javax.swing.*;

public class Window {
    private JFrame jFrame;

    public Window(Pannel pannel) {
         jFrame =new JFrame();
         jFrame.setSize(400,400);
         jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
         jFrame.add(pannel);
         jFrame.setLocationRelativeTo(null);
         jFrame.setVisible(true);

    }

}
