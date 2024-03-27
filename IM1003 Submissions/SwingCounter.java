import java.awt.*;       // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers
 
// A Swing application extends javax.swing.JFrame (instead of java.awt.Frame)
public class SwingCounter extends JFrame {
   private JTextField tfCount;
         // Use Swing's JTextField instead of AWT's TextField
   private JButton btnCount;
         // Using Swing's JButton instead of AWT's Button
   private int count = 0;
 
   public SwingCounter() {
      // Get the content-pane of top-level container Jframe
      // Components are added onto content pane
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
 
      cp.add(new JLabel("Counter"));
      tfCount = new JTextField(count + "", 10);
      tfCount.setEditable(false);
      tfCount.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfCount);
 
      btnCount = new JButton("Count");
      cp.add(btnCount);
      btnCount.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // Exit program if Jframe's close-window button clicked
      setSize(300, 100);
      setTitle("Swing Counter");
      setVisible(true);    // show it
   }
 
   public static void main(String[] args) {
      // Recommended to run the GUI construction in
      //  Event Dispatching thread for thread-safe operations
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new SwingCounter(); // Let the constructor does the job
         }
      });
   }
}