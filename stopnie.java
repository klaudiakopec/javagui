import javax.swing.*;

public class stopnie extends JFrame {
    private JPanel jpanel1;

    public static void main(String[] args){
        stopnie Example1 = new GUIForm;
        Example1.setVisible(true);
    }
    public stopnie(){
        super("Zamiana Fahrenheita na Celsjusza");
        //(°F - 32) x 5/9 = °C
        this.setContentPane(this.Jpanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
