import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    /*
    Analogy:-
    JFrame: Parent div
    JPanel: Child div
     */

    private int dots;

    Board() {
        setBackground(Color.BLACK);
        setFocusable(true);

        initGame();
    }

    public void initGame() {
        dots = 3;

        for(int i = 0; i < dots; i++) {

        }
    }
}
