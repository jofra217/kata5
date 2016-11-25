package moneycalculator11.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator11.model.Money;
import moneycalculator11.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

   public SwingMoneyDisplay() {
       setLayout(new FlowLayout());
       add(amount());
       add(currency());
   }

   private JLabel amount() {
       JLabel label = new JLabel();
       return label;
   }

   private JLabel currency() {
       JLabel label = new JLabel("$");
       return label;
   }

   @Override
   public void display(Money money) {
      // label.setText("");
   }



}