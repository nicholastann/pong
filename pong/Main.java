import javax.swing.JFrame;
public class Main {
    public static void main() {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        PongPanel p = new PongPanel();
        frame.add(p);

        
        
        frame.setVisible(true);
    }
}