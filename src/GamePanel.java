import java.awt.*;

//import java.awt.Color;

//import java.awt.Graphics;


import javax.swing.*;
public class GamePanel extends JPanel{
    private ImageIcon snaketitile = new ImageIcon(getClass().getResource("snaketitle.jpg"));    

    GamePanel(){
        
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.drawRect(24,10,851,55); 
        g.drawRect(24,74,851,576); 
        snaketitile.paintIcon(this,g,25,11);
        g.setColor(Color.BLACK); 
        g.fillRect(25,75,850,575);
    }
}
