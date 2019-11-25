import java.awt.*;
import javax.swing.*;
public class VerifierTest extends JFrame {

     public VerifierTest() {
         JTextField field1 = new JTextField("Type \"pass\" here");
         JTextField field2 = new JTextField("or \"accept\" here");
         getContentPane().add(field1, BorderLayout.NORTH);
         getContentPane().add(field2, BorderLayout.SOUTH);

         field1.setInputVerifier(new InputVerifier() {
             public boolean verify(JComponent input) {
                return "pass".equals(((JTextField) input).getText());
             }

             public boolean verifyTarget(JComponent input) {
                 return "accept".equals(((JTextField) input).getText());
             }

             public boolean shouldYieldFocus(JComponent source,
                                                          JComponent target) {
                 return verify(source) || verifyTarget(target);
             }
         });

         pack();
         setVisible(true);
     }

     public static void main(String[] args) {
         SwingUtilities.invokeLater(VerifierTest::new);
     }
 }
