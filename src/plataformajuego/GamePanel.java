
package plataformajuego;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel { 
    private int xDelta  = 0, yDelta = 0;
    private MouseInputs mouseInputs;
    public GamePanel(){
        
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(new MouseInputs());        
        addMouseMotionListener(mouseInputs);
    
    }
    
    public void changeXDelta(int value){
        this.xDelta +=value;
        repaint();
    }
    
    public void changeYDelta(int value){
        this.yDelta +=value;
        repaint();
    }
            
            
            
            
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.fillRect(100 + xDelta, 100 + yDelta, 200, 50);
    }
}
