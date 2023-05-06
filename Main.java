//Drawing Project
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class A extends Frame implements MouseMotionListener,MouseListener
{
    int x1,y1,x2,y2;
    boolean firstTouch=true;
    
    
    public void paint(Graphics g)
    {
        
        
        g.drawLine(x1,y1,x2,y2);
        
        x1=x2;
        y1=y2;
    }
    
    
    public void mouseClicked(MouseEvent event)
    {}
    
    public void mouseEntered(MouseEvent event)
    {}
    
    public void mouseExited(MouseEvent event)
    {}
    
    public void mousePressed(MouseEvent event)
    {}
    
    public void mouseReleased(MouseEvent event)
    {
        firstTouch=true;
    }
    
    
    
    
    
    
    
    
    
    public void mouseDragged(MouseEvent event)
    {
        
        if(firstTouch)
        {
            x1=x2=event.getX();
            y1=y2=event.getY();
            
            paint(getGraphics());
            firstTouch=false;
        }
        
        
        else{
        x2=event.getX();
        y2=event.getY();
        
        
        
        this.paint(getGraphics());}
    }
    
    public void mouseMoved(MouseEvent event)
    {
       
    }
    
    
    
    
    A()
    {
        setLocation(100,100);
        setSize(500,500);
     
        
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        
        setVisible(true);
    
        
    }

}

public class Main
{
    public static void main(String[] args)
    {
        A a=new A();
    }
    
}