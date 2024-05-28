package Chapt9;

import javax.swing.JButton;
import javax.swing.JFrame;

public class New {
    public static void main(String[] args) {
        var window = new InnerTest();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}


class InnerTest extends JFrame{
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    public InnerTest(){
        setSize(WIDTH, HEIGHT);
    }
    
}
