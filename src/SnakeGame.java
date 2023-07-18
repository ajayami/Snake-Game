import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;

    SnakeGame(){
        board = new Board();
        add(board);
        pack();
        setVisible(true);
        setResizable(false);

    }
    public static void main(String[] args) {
//        Initialize snake game;
        SnakeGame snakeGame = new SnakeGame();
    }
}