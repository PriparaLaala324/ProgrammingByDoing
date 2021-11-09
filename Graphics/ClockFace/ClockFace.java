import java.awt.*;
import javax.swing.JFrame;
public class ClockFace extends Canvas
{
  public void paint (Graphics g)
  {
    g.setColor(Color.black);
    g.drawOval(50,50,400,400);

    g.setColor(Color.gray);
    g.fillOval(245,245,10,10);

    g.setColor(Color.black);
    g.setFont(new Font("Consolas", Font.BOLD, 36));
    g.drawString("12",230,100);
    g.drawString("6",235,425);
    g.drawString("3",410,260);
    g.drawString("9",70,260);

    g.setColor(Color.black);
    g.drawLine(65,250,245,250);
    g.drawLine(100,290,245,250);
  }
    public static void main(String[]args)
    {
      JFrame win = new JFrame("ClockFace");
      win.setSize(500,500);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ClockFace canvas = new ClockFace();
      win.add(canvas);
      win.setVisible(true);
  }
}
