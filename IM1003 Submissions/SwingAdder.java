import java.awt.*;        // Using AWT's layouts
import java.awt.event.*;  // Using AWT's event classes and listener interfaces
import javax.swing.*;     // Using Swing's components and container
 
// A Swing application extends from javax.swing.JFrame
public class SwingAdder extends JFrame {
   private JTextField tfNumber1, tfNumber2, tfResult;
   private JButton btnAdd, btnClear;
   private int number1, number2, result;

   // Constructor to set up UI components and event handlers
   public SwingAdder() {
        // Swing components should be added to the content-pane of the JFrame.
        Container cp = getContentPane();
        // Set this Container to grid layout of 4 rows and 2 columns
        cp.setLayout(new GridLayout(4, 2, 10, 3));
    
        // Components are added from left-to-right, top-to-bottom
        cp.add(new JLabel("First Number "));     // at (1, 1)
        tfNumber1 = new JTextField(10);
        tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber1);                       // at (1, 2)
        
        cp.add(new JLabel("Second Number "));     // at (2, 1)
        tfNumber2 = new JTextField(10);
        tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber2);                      // at (2, 2)
        
        cp.add(new JLabel("Result "));     // at (3, 1)
        tfResult = new JTextField(10);
        tfResult.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfResult);                   // at (3, 2)
    
        btnAdd = new JButton("ADD");
        cp.add(btnAdd);                         // at (4, 1)
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1 + number2;
                tfResult.setText(Integer.toString(result));
            }
        });
    
        btnClear = new JButton("CLEAR");
        cp.add(btnClear);                          // at (4, 2)
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                tfNumber1.setText("");
                tfNumber2.setText("");
                tfResult.setText("");
            }
        });
    
        setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
        setTitle("Swing Adder");
        setSize(300, 170);
        setVisible(true);
   }
 
   // The entry main() method
   public static void main(String[] args) {
        // For thread safety, use the event-dispatching thread to construct UI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingArithmetics(); // Let the constructor does the job
            }
        });
   }
}