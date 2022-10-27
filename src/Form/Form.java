package Form;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {

    private Object button;
    private JPanel mainPanel;

    public Form(String title){
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        JButton button = new JButton("Test");
        frame.setMinimumSize( new Dimension(400,400) );
        frame.setLayout( null );
        frame.add( button );
        button.setBounds( 100,50,95,30 );

        frame.setVisible(true);
    }

}
