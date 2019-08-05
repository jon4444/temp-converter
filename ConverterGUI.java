import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class ConverterGUI here.
 *
 * @author John K. Fabiyi
 */
public class ConverterGUI
{
    // instance variables - replace the example below with your own
    private JFrame frame;

    /**
     * Constructor for objects of class ConverterGUI
     */
    public ConverterGUI()
    {
        makeFrame();
    }
         
    // --------------- the menu functions ---------------
     
    private void openFile()
    {
        System.out.println("open file");
    }
     
    /**
     * Quit function: quit the application.
     * 
     */
    private void quit()
    { 
        System.exit(0);
    }
    
    /**
     * creating the swing frame and its content 
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        makeMenuBar(frame);
        
        Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("temperature converter.");
        contentPane.add(label);
        
        //show the components
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * creating the main frame's menu bar  
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        //create the file menu
        JMenuItem fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> openFile());
        fileMenu.add(openItem);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(e -> quit());
        fileMenu.add(quitItem);
    }
}
