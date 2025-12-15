import javax.swing.*;

public class SnakeGame extends JFrame { // inherit JFrame
    SnakeGame() { // constructor class
        // use JFrame from swing package to make the frame of the game.
        super("Snake Game"); // must be the first statement in the constructor

        add(new Board());
        pack(); // refreshes frame to show the changes on it. kind of like set visible but cannot use it again and again.

        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true); // frame is preset by default, this cmd makes it visible
    }

    public static void main(String[] args) {
        new SnakeGame(); // anonymous class -> calls constructor class
    }
}