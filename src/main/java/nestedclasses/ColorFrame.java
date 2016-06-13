package nestedclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Jeka on 13/06/2016.
 */
public class ColorFrame extends JFrame {


    public ColorFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField textField = new JTextField("sdsdf");

        setSize(400,400);
        setLocation(100,100);
        JButton btn = new JButton("click to change color");
        btn.setBackground(Color.BLUE);


        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               Random random = new Random();
                Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
                getContentPane().setBackground(color);
                textField.setText("");
                repaint();
            }
        });



        this.setLayout(new BorderLayout());
        this.add(btn,BorderLayout.NORTH);
        this.add(textField,BorderLayout.SOUTH);
        setVisible(true);

    }


    public static void main(String[] args) {
        new ColorFrame();
    }
}














