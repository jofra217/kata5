package moneycalculator11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import moneycalculator11.model.Currency;
import moneycalculator11.model.Money;
import moneycalculator11.ui.swing.SwingMoneyDisplay;


public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setMenuBar(menubar());
        setLayout(new BorderLayout());
        add(moneyDisplay());
        //moneyDisplay.show(new Money(300, new Currency("USD", "Dólar", "$")));
        setVisible(true);
    }

    private MenuBar menubar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(calculateMenu());
        return menuBar;
    }

    private Menu calculateMenu() {
        Menu menu = new Menu("Calculator");
        menu.add(CalculateMenuItem());
        return menu;
    }

    private MenuItem CalculateMenuItem() {
        MenuItem menuItem = new MenuItem("Calculate");
        menuItem.addActionListener(executeCalculate());
        return menuItem;

    }

    private ActionListener executeCalculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha pinchao el botón");
            }
        };
    }
    
    private JLabel label (String value){
        return new JLabel(value);
    }

    private JPanel moneyDisplay() {
        SwingMoneyDisplay result = new SwingMoneyDisplay();
        return result;
    }
}