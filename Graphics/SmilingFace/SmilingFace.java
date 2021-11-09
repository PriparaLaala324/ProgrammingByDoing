import java.awt.*;
import javax.swing.JFrame;
public class SmilingFace extends Canvas
{
  public void paint(Graphics g)
  {
    g.setColor(Color.black);
    g.drawRect(0,0,500,500);

    g.setColor(Color.yellow);
    g.fillOval(100,100,300,300);

    g.setColor(Color.blue);
    g.fillOval(150,175,60,60);

    g.setColor(Color.blue);
    g.fillOval(300,175,60,60);

    g.setColor(Color.red);
    g.drawArc(175,225,150,125,255,90);
  }
  public static void main(String[]args)
  {
    JFrame win = new JFrame("A Smiling Face");
    win.setSize(500,500);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SmilingFace canvas = new SmilingFace();
    win.add(canvas);
    win.setVisible(true);
  }
}
