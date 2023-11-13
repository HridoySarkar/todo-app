package todoapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hridoy
 */
public class TitleBar extends JPanel{
    
    TitleBar(){
        this.setPreferredSize(new Dimension(400,60));
        
        JLabel titleTxt = new JLabel("Todo List");
        titleTxt.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleTxt.setHorizontalAlignment(JLabel.CENTER);
        titleTxt.setPreferredSize(new Dimension(200,60));
        titleTxt.setForeground(Color.black);
        this.add(titleTxt);
    }
}
