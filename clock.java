import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class clock extends JFrame{
    
    JFrame frame = new JFrame("Digital Clock");
    JLabel heading = new JLabel("Digital Clock");
    JLabel clocklabel = new JLabel("Created by Deep");
    JLabel timer1 = new JLabel();
    JLabel timer2 = new JLabel();
    Font font = new Font("ARIAL", Font.BOLD, 60);
    Font font1;
    Font timerFont = new Font("Century Schoolbook", Font.BOLD, 20);
    //Constructor
    clock(){
        this.prepareGui();
        this.createGui();
        this.timeclock();
        
    }

    //Preparing Gui
    public void prepareGui(){
        frame.setSize(400,225);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //CreateGui
    public void createGui(){
        heading.setFont(font);
        heading.setForeground(Color.CYAN);

        font1 = new Font("Imprint MT Shadow", Font.BOLD, 40);
        clocklabel.setFont(font1);
        clocklabel.setForeground(Color.DARK_GRAY);

        frame.add(heading);
        frame.add(clocklabel);
        frame.add(timer1);
        frame.add(timer2);
    }
    
    
    //Time Clock
    public void timeclock(){
        Timer timer = new Timer(600, new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a");
                SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM dd, y");
                String dateTime = sdf1.format(d);
                String dateTime1 = sdf.format(d);
                timer1.setText(dateTime);
                timer2.setText(dateTime1);
            }
            
        });
        timer1.setForeground(Color.GREEN);
        timer2.setForeground(Color.MAGENTA);
        timer1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        timer2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        timer1.setFont(timerFont);
        timer2.setFont(timerFont);
        timer.start();
    }

    public static void main(String[] args) {
        clock c =new clock();
    }
}