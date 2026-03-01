import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class problem12b extends JFrame implements ActionListener 
{
    JTextField num1;
    JTextField num2;
    JTextField result;
    JButton add;
    JButton clear;
    problem12b()
    {
        setTitle("varun");
        setSize(200,400);
         JLabel num1Label = new JLabel("enter num1");
         num1Label.setBounds(60,50,120,25);
         JLabel num2Label= new JLabel("enter num2");
          num2Label.setBounds(120,60,120,25);
              JLabel resultLabel = new JLabel("Result:");
        
        resultLabel.setBounds(60, 130, 120, 25);
        num1 = new JTextField();
        num1.setBounds(120,50,120,25);
        num2 = new JTextField();
        num2.setBounds(120,90,120,25);
        result = new JTextField();
        result.setBounds(120, 130, 120, 25);
        result.setEditable(false);
  

        add = new JButton("Add");
        add.setBounds(100,190 ,80 ,30 );
        clear= new JButton("clear");
        clear.setBounds(210, 190, 80, 30);
          add.addActionListener(this);
          clear.addActionListener(this);
          add(add);
          add(clear);
          add(resultLabel);
          add(num1);
          add(result);
          add(num2);
          add(num1Label);
          add(num2Label);
          setVisible(true);


    }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==add)
    {
        try{
            int n1= Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int sum=n1+n2;
            result.setText(String.valueOf(sum));
        }catch(NumberFormatException r)
        {
            result.setText("invalid");

        }

    }
    if(e.getSource()==clear)
    {
        result.setText("");
        num1.setText("");
        num2.setText("");
    }
  }

    public static void main(String[] args) {
        new problem12b();
    }
}