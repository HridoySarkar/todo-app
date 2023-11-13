package todoapp;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Hridoy
 */
public class AppFrame extends JFrame{
    private List list;
    private ButtonPanel btnPanel;
    private TitleBar title;
    
    private JButton addTask;
    private JButton clear;
    
    
    AppFrame(){
        setTitle("TODO APP - Java");
        
        
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();
        
        this.add(title,BorderLayout.NORTH);
        this.add(btnPanel,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);
        
        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClear();

        addListener();
    }

    
    public void addListener(){
        addTask.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                
                task.getDone().addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e){
                        task.changeState();
                        revalidate();
                    }
                });
                
                revalidate();
            }
        });
        clear.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
            list.removeComponentTasks();
            repaint();
        }
    });
    }
    

}
