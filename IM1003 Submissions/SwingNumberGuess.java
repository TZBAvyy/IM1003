import java.awt.*;        // Using AWT layouts
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;     // Using Swing components and containers

// A Swing GUI application inherits from top-level container javax.swing.JFrame
public class SwingNumberGuess extends JFrame {

// Private instance variables
private JTextField numField, guessField;
private JButton generateButton;
private JLabel guessResult;
private int number;

// Constructor to setup the GUI components and event handlers
public SwingNumberGuess() {
    // Retrieve the top-level content-pane from JFrame
    Container cp = getContentPane();

    // Content-pane sets layout
    cp.setLayout(new GridLayout(2, 3, 10, 5));

    guessResult = new JLabel("",SwingConstants.LEFT);

    // Content-pane adds components
    cp.add(new JLabel("The Number is ", SwingConstants.RIGHT));     //at (1,1)
    numField = new JTextField(10);
    numField.setHorizontalAlignment(SwingConstants.RIGHT);
    numField.setEditable(false);
    cp.add(numField);                                                //at (1,2)

    generateButton = new JButton("Generate");
    generateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            numField.setText("**");
            number = (int)(Math.random()*100);
        }
    });
    cp.add(generateButton);                                         //at (1,3)

    cp.add(new JLabel("Enter your guess ", SwingConstants.RIGHT));  //at (2,1)
    guessField = new JTextField(10);
    guessField.setHorizontalAlignment(SwingConstants.RIGHT);
    guessField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int guess = Integer.parseInt(guessField.getText());
            if (guess==number) {
                guessResult.setText("You Got it");
            } else if (guess>number) {
                guessResult.setText("Try Lower");
            } else if (guess<number) {
                guessResult.setText("Try Higher"); 
            }
        }
    });
    cp.add(guessField);                                             //at (2,2)

    cp.add(guessResult);                                            //at (2,3)

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Exit the program when the close-window button clicked
    setTitle("Guess Number");  // "super" JFrame sets title
    setSize(600, 100);   // "super" JFrame sets initial size
    setVisible(true);    // "super" JFrame shows
}

// The entry main() method
public static void main(String[] args) {
    // Run GUI codes in Event-Dispatching thread for thread-safety
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
        new SwingNumberGuess();  // Let the constructor do the job
        }
    });
}
}