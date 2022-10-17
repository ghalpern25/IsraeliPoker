package dev.halpern.IsraeliPoker;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Player {
    
    public static final int WIDTH = 1200;
    public static final int HEIGHT = WIDTH / 16 * 9;

    private JFrame frame;
    private JPanel panel;

    private ClientSideConnection cnc;

    public Player() {
        panel = new JPanel();
        panel.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //TODO: Change to allow connection to close
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void connectToServer() {
        cnc = new ClientSideConnection();
    }

    public static void main(String[] args) {
        Player p = new Player();
        p.connectToServer();
    }
}
