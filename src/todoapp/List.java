package todoapp;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;



/**
 *
 * @author Hridoy
 */
public class List extends JPanel{

    List(){
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(6);
        
        this.setLayout(layout);
        
    }
    public void updateNumbers(){
        Component[] listItems = this.getComponents();
        
        for(int i=0;i<listItems.length;i++){
            if(listItems[i] instanceof Task){
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }
    public void removeComponentTasks() {
        Component[] listItems = this.getComponents();

        for (Component listItem : listItems) {
            if (listItem instanceof Task) {
                remove(listItem);
            }
        }

        updateNumbers();
        revalidate();
        repaint();
    }
    
    
    
}
