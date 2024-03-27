import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTemperatureConverter extends JFrame{

    private JTextField celsField, fahrenField;
    private double celsius, fahrenheit;

    public SwingTemperatureConverter() {
        
        Container cp = getContentPane();

        cp.setLayout(new GridLayout(2, 2));

        cp.add(new JLabel("Celsius: ", SwingConstants.LEFT)); //at (1,1)
        celsField = new JTextField(10);
        celsField.setHorizontalAlignment(SwingConstants.LEFT);
        celsField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                celsius = Double.parseDouble(celsField.getText());
                fahrenheit = celsius*9/5 + 32;
                fahrenField.setText(String.format("%.2f", fahrenheit));
            }
        });
        cp.add(celsField);                      //at (1,2)

        cp.add(new JLabel("Fahrenheit: ", SwingConstants.LEFT)); //at (2,1)
        fahrenField = new JTextField(10);
        fahrenField.setHorizontalAlignment(SwingConstants.LEFT);
        fahrenField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                fahrenheit = Double.parseDouble(fahrenField.getText());
                celsius = (fahrenheit-32)*5/9;
                celsField.setText(String.format("%.2f", celsius));
            }
        });
        cp.add(fahrenField);                      //at (2,2)

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setSize(500,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTemperatureConverter();
            }
        });
    }
}
